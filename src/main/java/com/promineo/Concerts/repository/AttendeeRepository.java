package com.promineo.Concerts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineo.Concerts.entity.Attendee;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Integer>{



}
