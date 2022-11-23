package com.promineo.Concerts.controller;

import com.promineo.Concerts.entity.Attendee;
import com.promineo.Concerts.service.implementation.AttendeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("concert_attendee")
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
    @GetMapping("concert_attendee")
    public List<Attendee> getAttendee() {
        return attendeeService.getAttendee();
    }

    //Create Attendee API
    @PostMapping("/concert_attendee/{id}")
    public ResponseEntity<Attendee> saveAttendee(@RequestBody Attendee attendee) {
        return new ResponseEntity<>(attendeeService.saveAttendee(attendee), HttpStatus.CREATED);
    }

    //Deletes Attendee by ID API
    @DeleteMapping("/concert_attendee/{id}")
    public String deleteAttendee(@PathVariable int id) {
        return attendeeService.deleteAttendee(id);
    }

    @PutMapping("concert_attendee/{id}")
    public Attendee updateAttendee(@RequestBody Attendee attendee, @PathVariable int id) {
        return attendeeService.updateAttendee(id, attendee);
    }

}
