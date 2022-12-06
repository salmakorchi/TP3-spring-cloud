package org.sid.billingservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.billingservice.model.Customer;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

//this is a persistent class
// it means that it will exist in the database
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date billingDate;
    @OneToMany(mappedBy="bill")
    private Collection<ProductItem> productItem;
    private  Long customerID;
    @Transient // this means that it's not persistent and it will not be saved in the database
    private Customer customer;

}
// :)