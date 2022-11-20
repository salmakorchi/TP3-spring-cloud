package org.sid.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Product;

import javax.persistence.*;
//this is a persistent class
// it means that it will exist in the database
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class ProductItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double quantity ;
    private double price;
    private Long productID;
    @ManyToOne
    private Bill bill;

    @Transient
    private Product product;

}
