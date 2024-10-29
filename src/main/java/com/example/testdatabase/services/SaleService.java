package com.example.testdatabase.services;

import com.example.testdatabase.dto.ProductViewDTO;
import com.example.testdatabase.dto.SaleDTO;
import com.example.testdatabase.entites.Product;
import com.example.testdatabase.entites.ProductView;
import com.example.testdatabase.entites.Sale;
import com.example.testdatabase.repositories.ProductRepository;
import com.example.testdatabase.repositories.ProductViewRepository;
import com.example.testdatabase.repositories.SaleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductViewRepository productViewRepository;

    @Transactional
    public SaleDTO insert(SaleDTO dto){
        Sale sale = new Sale();
        sale.setQuantidade(dto.getQuantidade());
        Product product = productRepository.getReferenceById(dto.getProduct().getId());
        sale.setProduct(product);

        sale = saleRepository.saveAndFlush(sale);
        saleRepository.refresh(sale);


        System.out.println(sale.getValorTotal());

        return new SaleDTO(sale);
    }

    @Transactional(readOnly = true)
    public List<ProductViewDTO> getTotalProductSale(){
        List<ProductView> views = productViewRepository.findAll();
        return views.stream().map(ProductViewDTO::new).toList();
    }
}
