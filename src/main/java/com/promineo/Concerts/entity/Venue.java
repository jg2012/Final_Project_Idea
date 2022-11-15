package com.promineo.Concerts.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Venue")
public class Venue{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int venue_pk;

    @Column(value ="venue_name")
    private String venue_name;
    @Column(value ="venue_city")
    private String venue_city;
    @Column(value = "venue_state")
    private String venue_state;

}
