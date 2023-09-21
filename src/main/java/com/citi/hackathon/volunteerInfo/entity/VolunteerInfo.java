package com.citi.hackathon.volunteerInfo.entity;

import lombok.Data;

@Data
public class VolunteerInfo {
    private Long id;
    private String nickName;
    private String address;
    private String email;//optional
    private String organization;
    private String personalDescription;
}
