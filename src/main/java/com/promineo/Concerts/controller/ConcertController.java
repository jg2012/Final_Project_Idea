package com.promineo.Concerts.controller;


import com.promineo.Concerts.entity.Concert;
import com.promineo.Concerts.service.implementation.ConcertService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/Concerts")
@Slf4j
public class ConcertController {

    @Autowired
    private ConcertService concertService;

    @Autowired
    public ConcertController(ConcertService concertService){
        super();
        this.concertService = concertService;
    }

    // Gets the list of Concerts
    @GetMapping
    public Collection<Concert> getConcert(){
        return concertService.getConcert();
    }

    @PostMapping("/Concert")
    public ResponseEntity<Concert> saveConcert(@RequestBody Concert concert){
        return new ResponseEntity<Concert>(concertService.saveConcert(concert), HttpStatus.CREATED);
    }
    @DeleteMapping("/Concert/{id}")
   public String deleteConcert(@PathVariable int id){
        return concertService.deleteConcert(id);
   }

   @PutMapping
    public Concert updateConcert(@RequestBody Concert concert, @PathVariable int id){
        return concertService.updateConcert(id, concert);
   }
}
