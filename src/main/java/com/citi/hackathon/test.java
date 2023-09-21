package com.citi.hackathon;

import com.citi.hackathon.document.entity.UserDocument;
import com.citi.hackathon.event.entity.Event;
import com.citi.hackathon.event.entity.EventStatus;
import com.citi.hackathon.event.entity.SubEvent;
import com.citi.hackathon.volunteerInfo.entity.VolunteerInfo;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.citi.hackathon.Constants.dataFormat;

public class test {


    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat(dataFormat);
        SubEvent subEvent1=new SubEvent();
        subEvent1.setEventStatus(EventStatus.IN_PROGRESS);
        subEvent1.setAssignee("Lee");
        subEvent1.setDescription("health care");
        subEvent1.setOrganization("Xiehe Hospital");
        subEvent1.setNotificationReceiver("Joey");
        subEvent1.setSubEventIndex(0);
        subEvent1.setEventId(222L);
        subEvent1.setCreateTime(sdf.format(new Date()));

        SubEvent subEvent2=new SubEvent();
        subEvent2.setEventStatus(EventStatus.COMPLETED);
        subEvent2.setAssignee("Lee");
        subEvent2.setDescription("health care");
        subEvent2.setOrganization("Xiehe Hospital");
        subEvent2.setNotificationReceiver("Joey");
        subEvent2.setCreateTime(sdf.format(new Date()));
        subEvent2.setSubEventIndex(1);
        subEvent2.setEventId(222L);
        subEvent2.setCompleteTime(sdf.format(new Date()));
        Gson gson=new Gson();
        System.out.println(gson.toJson(subEvent1));
        System.out.println("_______________________________________________________");

        Event event1=new Event();
        event1.setId(222L);
        event1.setAssignee("Lee");
        event1.setEventIndex(0);
        event1.setEventStatus(EventStatus.COMPLETED);
        event1.setDescription("create document");
        event1.setCompleteTime(sdf.format(new Date()));
        event1.setCreateTime(sdf.format(new Date()));
        event1.setOrganization("Springboard");
        event1.setSubEventList(new ArrayList<>());
        event1.setDocumentId(1514L);
        event1.setNotificationReceiver("Lee");

        Event event2=new Event();
        event2.setAssignee("May");
        event2.setEventIndex(1);
        event2.setEventStatus(EventStatus.IN_PROGRESS);
        event2.setDescription("hospital care");
        event2.setCompleteTime(sdf.format(new Date()));
        event2.setCreateTime(sdf.format(new Date()));
        event2.setOrganization("hospital");
        event2.setDocumentId(1514L);
        event2.setSubEventList(List.of(subEvent1,subEvent2));
        event2.setNotificationReceiver("Lee");

        System.out.println(gson.toJson(event2));
        System.out.println("_______________________________________________________");

        UserDocument document=new UserDocument();
        document.setName("Stephen");
        document.setId(1514L);
        document.setAuthenticationId("US ID number");
        document.setEventList(List.of(event1,event2));
        document.setCreateTime(sdf.format(new Date()));

        System.out.println(gson.toJson(document));
        System.out.println("_______________________________________________________");

        VolunteerInfo volunteerInfo=new VolunteerInfo();
        volunteerInfo.setNickName("Lee");
        volunteerInfo.setEmail("test@citi.com");
        volunteerInfo.setOrganization("Springboard");
        volunteerInfo.setAddress("Shanghai ZJ");
        volunteerInfo.setPersonalDescription("Very familiar with health care and house find");

        System.out.println(gson.toJson(volunteerInfo));
        System.out.println("_______________________________________________________");



    }
}
