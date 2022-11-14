package com.promineo.Concerts.service.implementation;

import java.util.List;

import com.promineo.Concerts.entity.Attendee;
import com.promineo.Concerts.repository.AttendeeRepository;


public interface AttendeeService {

    Attendee saveAttendee(Attendee attendee);
    
    List<Attendee> getAttendee(); 


}
