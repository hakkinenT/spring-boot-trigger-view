package com.example.testdatabase.repositories.sale;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

public class SaleRefreshRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements SaleRefreshRepository<T, ID> {
    private final EntityManager entityManager;

    public SaleRefreshRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public void refresh(T t) {
        entityManager.refresh(t);
    }
}
