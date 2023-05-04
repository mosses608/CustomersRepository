package com.SpringBoot.MyString.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mycustomers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false)
    private String CustomerName;
    @Column(nullable = false)
    private String Items;
    @Column(nullable = false)
    private String Price;
    @Column(nullable = false)
    private String CustomerEmail;
}
