package com.promineo.Concerts.controller;

import com.promineo.Concerts.entity.Venue;
import com.promineo.Concerts.service.implementation.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Concerts/Venue")
public class VenueController {

    @Autowired
    private VenueService venueService;

    @Autowired
    public VenueController(VenueService venueService){
        super();
        this.venueService = venueService;
    }

    @GetMapping
    public List<Venue> getVenue(){
        return venueService.getVenue();
    }

    @PostMapping("/Venue")
    public ResponseEntity<Venue> saveVenue(@RequestBody Venue venue){
        return  new ResponseEntity<Venue>(venueService.saveVenue(venue), HttpStatus.CREATED);
    }

    @DeleteMapping ("/Venue/{id}")
    public String deleteVenue(@PathVariable int id){
        return venueService.deleteVenue(id);
    }




}
