package com.example.demo.models;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.math.BigDecimal;

@Entity
@Data
public class PlantInventoryEntry {
    @Id @GeneratedValue
    Long id;
    String name;
    String description;
    BigDecimal price;
}
