package com.promineo.Concerts.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.Concerts.entity.Attendee;
import com.promineo.Concerts.repository.AttendeeRepository;


@Service
public class AttendeeServiceImp implements AttendeeService {
        
    private AttendeeRepository attendeeRepository; 
    @Autowired
    public AttendeeServiceImp(AttendeeRepository attendeeRepository) {
	this.attendeeRepository = attendeeRepository; 
    }

    @Override
    public Attendee saveAttendee(Attendee attendee) {
	return attendeeRepository.save(attendee); 
    }


    


    

 
   
    
}
