package com.example.app.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private int id;
    private String userId;
    private String password;
    private String nickName;
    private String email;
    private LocalDateTime createDate;
}
