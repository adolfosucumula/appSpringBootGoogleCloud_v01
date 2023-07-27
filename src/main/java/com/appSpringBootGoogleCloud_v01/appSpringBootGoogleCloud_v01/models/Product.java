package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends BaseEntity{

    @Column(name = "codename")
    private String codename;

    @Column(name = "description")
    private String description;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "family")
    private String family;

    @Column(name = "mark")
    private String mark;
    
    
}
