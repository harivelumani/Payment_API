package com.example.payment_api.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    private double amount;
    private String status;
}