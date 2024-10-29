CREATE OR REPLACE FUNCTION calcular_valor_total()
RETURNS TRIGGER AS $$
DECLARE
    preco_produto NUMERIC(10, 2);
BEGIN
    -- Seleciona o preço do produto usando JOIN
    SELECT p.preco INTO preco_produto
    FROM produtos p
    JOIN vendas v ON p.id = NEW.produto_id;

    -- Calcula o valor_total como preço * quantidade
    NEW.valor_total := preco_produto * NEW.quantidade;

    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER trigger_calcular_valor_total
BEFORE INSERT OR UPDATE ON vendas
FOR EACH ROW
EXECUTE FUNCTION calcular_valor_total();
