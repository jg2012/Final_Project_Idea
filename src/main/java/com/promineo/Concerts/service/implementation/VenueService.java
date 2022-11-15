package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Venue;

import java.util.List;

public interface VenueService {

    public Venue saveVenue(Venue venue);

    public List<Venue> getVenue();

    public String deleteVenue(int id);

    public Venue updateVenue(int id, Venue venue);

}
