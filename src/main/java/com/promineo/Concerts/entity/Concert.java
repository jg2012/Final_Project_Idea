package com.promineo.Concerts.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name = "concert")
public class Concert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_id;

    @Column("concert_date")
    private Date concert_date;

    @Column("concert_musical_artist")
    private String concert_musical_artist;

    @Column("concert_venue_name")
    private String concert_venue_name;

    @Column("concert_city")
    private String concert_city;

    @Column("concert_city")
    private String concert_state;

}
