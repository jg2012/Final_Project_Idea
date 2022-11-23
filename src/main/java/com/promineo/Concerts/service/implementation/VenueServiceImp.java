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
        return venueRepository.save(venue);
    }

    @Override
    public List<Venue> getVenue() {
        return venueRepository.findAll();
    }

    @Override
    public String deleteVenue(int id) {

        venueRepository.deleteById(id);
        return "Delete venue with id:" + id;
    }

    @Override
    public Venue updateVenue(int id, Venue venue) {

        venue.setConcert_venue_name(venue.getConcert_venue_name());
        venue.setConcert_venue_city(venue.getConcert_venue_city());
        venue.setConcert_venue_state(venue.getConcert_venue_state());
        return venueRepository.save(venue);
    }
}
