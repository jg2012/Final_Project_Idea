package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Concert;
import com.promineo.Concerts.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertServiceImp implements ConcertService {

    private final ConcertRepository concertRepository;

    @Autowired
    public ConcertServiceImp(ConcertRepository concertRepository) {
        this.concertRepository = concertRepository;
    }


    @Override
    public Concert saveConcert(Concert concert) {
        return concertRepository.save(concert);
    }

    @Override
    public List<Concert> getConcert() {
        return concertRepository.findAll();
    }

    @Override
    public String deleteConcert(int id) {

        concertRepository.deleteById(id);

        return "Delete concert with id" + id;
    }

    @Override
    public Concert updateConcert(int id, Concert concert) {

        concert.setConcert_date(concert.getConcert_date());
        concert.setConcert_musical_artist(concert.getConcert_musical_artist());
        concert.setConcert_venue_name(concert.getConcert_venue_name());
        concert.setConcert_city(concert.getConcert_city());
        concert.setConcert_state(concert.getConcert_state());

        return concertRepository.save(concert);
    }
}
