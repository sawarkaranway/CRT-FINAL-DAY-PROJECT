package com.test.flight.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @Column(name = "flight_code")
    private String flightCode;

    private String carrier;

    private String source;

    private String destination;

    private Double cost;


    public Flight() {

    }

    
    public Flight(String flightCode,
                  String carrier,
                  String source,
                  String destination,
                  Double cost) {

        this.flightCode = flightCode;
        this.carrier = carrier;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}