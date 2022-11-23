package com.promineo.Concerts.repository;

import com.promineo.Concerts.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer> {
}
