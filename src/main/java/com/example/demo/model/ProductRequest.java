/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import lombok.Data;

/**
 *
 * @author maheshvari.keshari
 */
@Data
public class ProductRequest {
    
    String productName, info, desc;
    Double price;
}
