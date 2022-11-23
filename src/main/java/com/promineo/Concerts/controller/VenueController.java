package com.promineo.Concerts.controller;

import com.promineo.Concerts.entity.Venue;
import com.promineo.Concerts.service.implementation.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Venue")
public class VenueController {

    @Autowired
    private VenueService venueService;

    @Autowired
    public VenueController(VenueService venueService) {
        super();
        this.venueService = venueService;
    }

    @GetMapping("concert_venue")
    public List<Venue> getVenue() {
        return venueService.getVenue();
    }

    @PostMapping("concert_venue")
    public ResponseEntity<Venue> saveVenue(@RequestBody Venue venue) {
        return new ResponseEntity<>(venueService.saveVenue(venue), HttpStatus.CREATED);
    }

    @DeleteMapping("/concert_venue/{id}")
    public String deleteVenue(@PathVariable int id) {
        return venueService.deleteVenue(id);
    }

    @PutMapping("concert_venue/{id}")
    public Venue updateVenue(@RequestBody Venue venue, @PathVariable int id) {
        return venueService.updateVenue(id, venue);
    }


}
