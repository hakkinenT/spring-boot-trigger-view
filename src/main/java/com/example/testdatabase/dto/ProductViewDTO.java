package com.example.testdatabase.dto;

import com.example.testdatabase.entites.ProductView;

public class ProductViewDTO {
    private Long id;

    private String nome;
    private Integer totalVendas;

    public ProductViewDTO() {
    }

    public ProductViewDTO(Long id, String nome, Integer totalVendas) {
        this.id = id;
        this.nome = nome;
        this.totalVendas = totalVendas;
    }

    public ProductViewDTO(ProductView entity) {
        id = entity.getId();
        nome = entity.getNome();
        totalVendas = entity.getTotalVendas();
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

    public Integer getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Integer totalVendas) {
        this.totalVendas = totalVendas;
    }
}
