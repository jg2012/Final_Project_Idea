package com.promineo.Concerts.entity;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;
import java.util.Date;



@Data
@Entity
@Table(name = "concert_attendee")
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_attendee_id;


    @Column(value = "concert_attendee_first_name")
    private String concert_attendee_first_name;

    @Column(value = "concert_attendee_last_name")
    private String concert_attendee_last_name;

    @Column(value = "concert_musical_artist")
    private String concert_musical_artist;

    @Column(value = "concert_venue_name")
    private String concert_venue_name;

    @Column(value = "concert_city")
    private String concert_city;

    @Column(value = "concert_state")
    private String concert_state;

    @Column(value = "concert_date")
    private Date concert_date;





}
