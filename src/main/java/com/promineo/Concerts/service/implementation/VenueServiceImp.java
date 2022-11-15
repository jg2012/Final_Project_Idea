package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Venue;
import com.promineo.Concerts.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImp implements VenueService {

    private final VenueRepository venueRepository;
    @Autowired
    public VenueServiceImp(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public Venue saveVenue(Venue venue) {
return null;     }

    @Override
    public List<Venue> getVenue() {
        return null;
    }

    @Override
    public String deleteVenue(int id) {
        return null;
    }

    @Override
    public Venue updateVenue(int id, Venue venue) {
        return null;
    }
}
