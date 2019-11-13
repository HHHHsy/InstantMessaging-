package com.hsy.hrxcy.testhrx.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"phone"})
})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String phone;
    private String name;
    private String password;
    private String bio;
    private String avatar;
    private LocalDate birthday;
    private Long gender;






}
