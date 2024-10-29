package com.example.testdatabase.dto;

import com.example.testdatabase.entites.Product;
import com.example.testdatabase.entites.Sale;

public class SaleDTO {
    private Long id;

    private int quantidade;
    private Double valorTotal;
    private ProductDTO product;

    public SaleDTO() {
    }

    public SaleDTO(Long id, int quantidade, Double valorTotal, ProductDTO product) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.product = product;
    }

    public SaleDTO(Sale sale) {
        this.id = sale.getId();
        this.quantidade = sale.getQuantidade();
        this.valorTotal = sale.getValorTotal();
        this.product = new ProductDTO(sale.getProduct());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}
