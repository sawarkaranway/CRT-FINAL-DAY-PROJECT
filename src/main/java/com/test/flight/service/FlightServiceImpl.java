package com.test.flight.service;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.flight.entity.Flight;
import com.test.flight.repository.FlightRepository;



@Service
public class FlightServiceImpl
        implements FlightService {

    @Autowired
    private FlightRepository repository;

    @Override
    public Flight save(Flight flight) {

        return repository.save(flight);
    }

    @Override
    public Flight findByCode(String code) {

        return repository
                .findById(code)
                .orElse(null);
    }

    @Override
    public List<Flight> findByCarrier(
            String carrier) {

        return repository
                .findByCarrier(carrier);
    }

    @Override
    public List<Flight> findByRoute(
            String src,
            String dest) {

        return repository
                .findBySourceAndDestination(
                        src,
                        dest
                );
    }

    @Override
    public List<Flight> findByPriceRange(
            Double min,
            Double max) {

        return repository
                .findByCostBetween(min, max);
    }

    @Override
    public List<Flight> list() {

        return repository.findAll();
    }

    @Override
    public void delete(String code) {

        repository.deleteById(code);
    }
    
}