/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author maheshvari.keshari
 */
@Entity
@Table(name = "product")
@Data
public class Product implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @SequenceGenerator(name = "PRODUCT_ID_SEQ",
            sequenceName = "product_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_ID_SEQ")
    @Basic(optional = false)

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "info")
    private String info;

    @Column(name = "description")
    private String description = "";

    @Column(name = "price")
    private Double price;

}
