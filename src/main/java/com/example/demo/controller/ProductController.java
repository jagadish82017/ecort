/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.model.ProductRequest;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author maheshvari.keshari
 */
@RestController
@RequestMapping("/product")
@Api(value = "product")
public class ProductController {

    @Autowired
    ProductService service;

    @Autowired
    ProductRepo repo;
    
    @RequestMapping(value = "/create", method = RequestMethod.POST,
            produces = "application/json")
    @ApiOperation(value = "Create product")
    public Product create(@RequestHeader(value = "Authorization") @ApiParam
        (value = " Auth Token", required = true) String token,
        @RequestBody ProductRequest request) {
        return service.saveProduct(request);
    }

    @RequestMapping(value = "/find/{productId}", method = RequestMethod.GET,
            produces = "application/json")
    @ApiOperation(value = "Search by product ID")
    public Optional<Product> findById(@RequestHeader(value = "Authorization") @ApiParam
        (value = " Auth Token", required = true) String token, 
        Integer productId) {
        return service.findById(productId);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET,
            produces = "application/json")
    @ApiOperation(value = "find all list")
    public List<Product> findAll(@RequestHeader(value = "Authorization") @ApiParam
        (value = " Auth Token", required = true) String token)
    {
        return service.findAll();
    }
}
