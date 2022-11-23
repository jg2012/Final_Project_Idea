package com.promineo.Concerts.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;

@Data
@Entity
@Table(name = "concert_venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_venue_id;

    @Column(value = "concert_venue_name")
    private String concert_venue_name;
    @Column(value = "concert_venue_city")
    private String concert_venue_city;
    @Column(value = "concert_venue_state")
    private String concert_venue_state;



}
