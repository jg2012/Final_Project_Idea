package com.promineo.Concerts.service.implementation;

import com.promineo.Concerts.entity.Concert;

import java.util.List;

public interface ConcertService {

     Concert saveConcert(Concert concert);

    List<Concert> getConcert();

    String deleteConcert(int id);

     Concert updateConcert(int id, Concert concert);


}
