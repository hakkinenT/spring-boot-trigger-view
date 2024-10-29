package com.example.testdatabase.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "vw_product_sale")
public class ProductView {
    @Id
    private Long id;

    private String nome;
    private Integer totalVendas;

    public ProductView() {
    }

    public ProductView(Long id, String nome, Integer totalVendas) {
        this.id = id;
        this.nome = nome;
        this.totalVendas = totalVendas;
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
