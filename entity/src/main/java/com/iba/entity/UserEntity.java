package com.iba.entity;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;


@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "name", nullable = false, length = 40)
    private String name;

}
