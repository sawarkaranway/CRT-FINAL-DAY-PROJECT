package com.test.flight.service;

import java.util.List;

import com.test.flight.entity.Flight;


public interface FlightService {

    Flight save(Flight flight);

    Flight findByCode(String code);

    List<Flight> findByCarrier(String carrier);

    List<Flight> findByRoute(
            String src,
            String dest
    );

    List<Flight> findByPriceRange(
            Double min,
            Double max
    );

    List<Flight> list();

    void delete(String code);
}
