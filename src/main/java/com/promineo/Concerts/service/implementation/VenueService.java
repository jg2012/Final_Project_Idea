package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Venue;

import java.util.List;

public interface VenueService {
    Venue saveVenue(Venue venue);

     List<Venue> getVenue();

     String deleteVenue(int id);

     Venue updateVenue(int id, Venue venue);

}
