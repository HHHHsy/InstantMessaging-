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
@EntityListeners(AuditingEntityListener.class)
//聊天信息表
public class ChatInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long informationid;
    private Long fromidaid;
    private Long toid;
    private String content;
    @CreatedDate
    private LocalDateTime date;

}

