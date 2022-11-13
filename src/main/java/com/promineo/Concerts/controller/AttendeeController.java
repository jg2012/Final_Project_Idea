package com.promineo.Concerts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.Concerts.entity.Attendee;
import com.promineo.Concerts.service.implementation.AttendeeService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/Concert/Attendee")
@Slf4j
public class AttendeeController {
    @Autowired
     private AttendeeService attendeeService; 
     
    public AttendeeController(AttendeeService attendeeService) {
    	super(); 
    	this.attendeeService = attendeeService; 
    }
    
    //Create Attendee API
    @PostMapping
    public ResponseEntity<Attendee> saveAttendee(@RequestBody Attendee attendee){ 
	return new ResponseEntity<Attendee>(attendeeService.saveAttendee(attendee), HttpStatus.CREATED);
    }
    
    
    
    
    
}
