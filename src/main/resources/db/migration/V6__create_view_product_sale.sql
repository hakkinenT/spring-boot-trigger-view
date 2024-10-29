CREATE VIEW vw_product_sale AS
SELECT p.id, p.nome, count(v.id) AS total_vendas
FROM vendas AS v
JOIN produtos AS p ON v.produto_id=p.id
GROUP BY p.id, p.nome;