package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Attendee;

import java.util.List;


public interface AttendeeService {

  Attendee saveAttendee(Attendee attendee);

   List<Attendee> getAttendee();

    String deleteAttendee(int id);

    Attendee updateAttendee(int id, Attendee attendee);


}
