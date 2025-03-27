package com.widget.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Value;

@Entity
@Data
@Table(name = "widget")
public class Widget {

    @Column(name = "name", nullable = false,unique = true)
    @Size(min = 3,max=100,message = "Name must be between 3 to 100 characters")
    @Id
    private String name;
    @Column(name = "description", nullable = false,unique = false)
    @Size(min = 5,max = 1000,message = "Description must be beetween 5 to 1000 characters")
    private String description;
    @Column(name = "price", unique = false)
    @DecimalMin(value = "1.00",message = "Price must be atleaset 1")
    @DecimalMax(value = "20000.00",message = "Price must be max 20000")
    private double price;
}
