package com.akkodis.juanfgr.shop.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "price")
@Getter
@Setter
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startDate")
    @DateTimeFormat(pattern="YYYY-MM-dd HH.mm.ss")
    private Date startDate;

    @Column(name = "endDate")
    @DateTimeFormat(pattern="YYYY-MM-dd HH.mm.ss")
    private Date endDate;


    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product product;


    private Long priority;
    private double cost;
    private String current;


}
