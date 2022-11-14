package com.promineo.Concerts.controller;

import java.util.Collection;

import com.promineo.Concerts.service.implementation.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.promineo.Concerts.entity.Attendee;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/Concert/Attendee")
@Slf4j
public class AttendeeController {
    @Autowired
    private AttendeeService attendeeService; 
     
    @Autowired
    public AttendeeController(AttendeeService attendeeService) {
    	super(); 
    	this.attendeeService = attendeeService; 
    }
  
   //Gets the list of Attendees
  @GetMapping
  public Collection<Attendee> getAttendee(){
      return  attendeeService.getAttendee();
  }
    
    //Create Attendee API
    @PostMapping("/Attendee")
    public ResponseEntity<Attendee> saveAttendee(@RequestBody Attendee attendee){ 
	return new ResponseEntity<Attendee>(attendeeService.saveAttendee(attendee), HttpStatus.CREATED);
    }

    //Deletes Attendee by ID API
    @DeleteMapping("/Attendee/{id}")
    public String deleteAttendee(@PathVariable int id){
        return attendeeService.deleteAttendee(id);
    }

    @PutMapping
    public Attendee updateAttendee (@RequestBody Attendee attendee, @PathVariable int id){
        return attendeeService.updateAttendee(id, attendee); 
    }
    
}
