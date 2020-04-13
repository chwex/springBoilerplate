package com.boilerplate.boilerplate.domain.entities;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Data
@Entity
@DynamicInsert
@DynamicUpdate

@Table(name="users")

public class User {
    @Id
    @Column(name="id", unique = true, nullable = false, precision = 20, scale = 0)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;
}
