package com.hsy.hrxcy.testhrx.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"phone"})
})
@EntityListeners(AuditingEntityListener.class)
//用户表
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
    @CreatedDate
    private LocalDateTime birthday;
    private Long gender;

}
