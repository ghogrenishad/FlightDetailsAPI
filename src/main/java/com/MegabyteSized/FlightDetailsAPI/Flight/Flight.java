package com.MegabyteSized.FlightDetailsAPI.Flight;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "flight_details")
public class Flight {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private String Id;
    @Column(name = "flight_name")
    private String name;
    @Column(name = "price")
    private int price;
    @Column(name = "flight_source")
    private String source;
    @Column(name = "flight_destination")
    private String destination;
    @Column(name = "flight_date")
    private LocalDate date;
    @Column(name = "dept_time")
    private LocalTime deptTime;
    @Column(name = "arrival_time")
    private LocalTime arrivalTime;

    @Override
    public String toString(){
        return "Flight [Id = " + Id + ", Name = " + name +", price = " + price + ", Source = " + source
                + ", Destination = " + destination + ", Date = " + date + ", Departure Time = " + deptTime
                + ", Arrival Time = " + arrivalTime + "]";
    }
}
