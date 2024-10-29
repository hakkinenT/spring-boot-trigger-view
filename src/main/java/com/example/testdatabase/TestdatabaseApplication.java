package com.example.testdatabase;

import com.example.testdatabase.repositories.sale.SaleRefreshRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = SaleRefreshRepositoryImpl.class)
public class TestdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestdatabaseApplication.class, args);
	}

}
