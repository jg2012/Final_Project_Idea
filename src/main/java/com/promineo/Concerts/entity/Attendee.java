package com.promineo.Concerts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;



@Data
@Entity 
@Table(name = "Attendee")
public class Attendee {
    	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int attendee_pk; 
  
  @Column(value="attendee_first_name")
  private String attendee_first_name;
  
  @Column(value="attendee_last_name")
  private String attendee_last_name;
  
  @Column(value="attendee_city")
  private String attendee_city; 
  
  @Column(value="attendee_state")
  private String attendee_state; 
  
  @Column(value="concert_attendance")
  private String concert_attendance; 
  
}
