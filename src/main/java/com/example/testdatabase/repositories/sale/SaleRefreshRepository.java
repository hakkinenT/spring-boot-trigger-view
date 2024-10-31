package com.example.testdatabase.repositories.sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SaleRefreshRepository<T, ID> extends JpaRepository<T, ID>{
    void refresh(T t);

    default T saveAndRefresh(T t){
        t = save(t);
        refresh(t);

        return t;
    }
}
