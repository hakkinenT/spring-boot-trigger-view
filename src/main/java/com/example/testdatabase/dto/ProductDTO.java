package com.example.testdatabase.dto;

import com.example.testdatabase.entites.Product;

public class ProductDTO {
    private Long id;

    private String nome;
    private Double preco;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        nome = entity.getNome();
        preco = entity.getPreco();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
