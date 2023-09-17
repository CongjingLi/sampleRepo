package com.citi.hackathon.event.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Event {
    private Long id;
    private String organization;
    private String assignee;
    private String description;
    private String createTime;
    private String completeTime;
    private String notificationReceiver;
    private List<SubEvent> subEventList;
    private int eventIndex;
    private EventStatus eventStatus;
}
