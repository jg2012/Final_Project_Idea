package com.promineo.Concerts.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import javax.persistence.*;

@Data
@Entity
@Table(name ="Concert")
public class Concert {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int concert_pk;

    @Column(value = "musical_artist")
    private String musical_artist;

    @Column(value = "concert_data")
    private String concert_date;

    @Column(value = "convert_venue")
    private String concert_venue;

    @Column(value = "concert_city")
    private String concert_city;

   @Column(value = "concert_state")
    private String concert_state;

    @Column(value = "concert_attendee")
    private String concert_attendee;

}
