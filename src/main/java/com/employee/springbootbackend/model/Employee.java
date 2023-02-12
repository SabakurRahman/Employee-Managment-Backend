package com.employee.springbootbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "f_name")
    private String frist_name;
    @Column(name = "l_name")
    private String last_name;
    @Column(name = "email_id")
    private String email_id;
}
