package com.employeeform.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Country country;

}