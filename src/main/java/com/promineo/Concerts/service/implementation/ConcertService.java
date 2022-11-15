package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Concert;

import java.util.List;

public interface ConcertService {

    public Concert saveConcert(Concert concert);

    public List<Concert> getConcert();

    public String deleteConcert(int id);

    public Concert updateConcert(int id, Concert concert);


}
