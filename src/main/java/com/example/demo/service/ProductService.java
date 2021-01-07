/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.model.ProductRequest;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author maheshvari.keshari
 */
public interface ProductService {
 
    public Product saveProduct(ProductRequest product);
    
    public Optional<Product> findById(Integer productId);
    
    public List<Product> findAll();
}
