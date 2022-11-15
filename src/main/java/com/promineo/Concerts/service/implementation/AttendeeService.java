package com.promineo.Concerts.service.implementation;

import java.util.List;

import com.promineo.Concerts.entity.Attendee;
import org.springframework.web.bind.annotation.PathVariable;


public interface AttendeeService {

    public Attendee saveAttendee(Attendee attendee);
    
    public List<Attendee> getAttendee();

    public String deleteAttendee(int id);

    public Attendee updateAttendee(int id, Attendee attendee);



}
