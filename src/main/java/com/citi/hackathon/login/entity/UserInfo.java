package com.citi.hackathon.login.entity;

import lombok.Data;

@Data
public class UserInfo {
    private Long id;
    private String userName;
    private String password;
    private String nickName;
    private String address;
    private String email;//optional
}
