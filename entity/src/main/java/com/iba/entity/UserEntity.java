package com.iba.entity;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {
    @Id
    private int id;

    @Column(name = "name")
    private String name;

}
