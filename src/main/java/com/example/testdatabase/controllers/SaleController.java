package com.example.testdatabase.controllers;

import com.example.testdatabase.dto.ProductViewDTO;
import com.example.testdatabase.dto.SaleDTO;
import com.example.testdatabase.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @PostMapping
    public ResponseEntity<SaleDTO> insert(@RequestBody SaleDTO dto){
        dto = saleService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @GetMapping("/product")
    public ResponseEntity<List<ProductViewDTO>> getProductSale(){
        List<ProductViewDTO> list = saleService.getTotalProductSale();
        return ResponseEntity.ok(list);
    }
}
