package com.test.flight.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.flight.entity.Flight;
import com.test.flight.service.FlightService;



@RestController

@RequestMapping("/flights")

@CrossOrigin("*")

public class FlightController {

    @Autowired
    private FlightService service;


    @PostMapping
    public Flight save(
            @RequestBody Flight flight) {

        return service.save(flight);
    }

    
    @GetMapping("/{code}")
    public Flight findByCode(
            @PathVariable String code) {

        return service.findByCode(code);
    }


    @GetMapping("/carrier/{carrier}")
    public List<Flight> findByCarrier(
            @PathVariable String carrier) {

        return service.findByCarrier(carrier);
    }

    @GetMapping("/route")
    public List<Flight> findByRoute(

            @RequestParam String src,

            @RequestParam String dest) {

        return service.findByRoute(
                src,
                dest
        );
    }


    @GetMapping("/price")
    public List<Flight> findByPriceRange(

            @RequestParam Double min,

            @RequestParam Double max) {

        return service.findByPriceRange(
                min,
                max
        );
    }
  
    @GetMapping
    public List<Flight> list() {

        return service.list();
    }

   
    @DeleteMapping("/{code}")
    public void delete(
            @PathVariable String code) {

        service.delete(code);
    }
}