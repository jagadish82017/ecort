/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service.implimentation;

import com.example.demo.entity.Product;
import com.example.demo.model.ProductRequest;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author maheshvari.keshari
 */
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;
    
    @Override
    public Product saveProduct(ProductRequest request) {
        
        Product product = new Product();
        
        product.setProductName(request.getProductName());
        product.setPrice(request.getPrice());
        product.setInfo(request.getInfo());
        product.setDescription(request.getDesc());
        return productRepo.save(product);
        
    }

    @Override
    public Optional<Product> findById(Integer productId) {
        return productRepo.findById(productId);
    }

    @Override
    public List<Product> findAll() {
       return productRepo.findAll();
    }
    
}
