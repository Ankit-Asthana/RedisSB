package com.redis1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "USERR")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "USER_ID")
    private long id;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "USER_EMAIL_ID")
    private String emailId;
    @Column(name = "USER_PHONE_NO")
    private String phoneNo;
}

