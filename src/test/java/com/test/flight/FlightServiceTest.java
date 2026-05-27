package com.test.flight;



import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.test.flight.entity.Flight;
import com.test.flight.service.FlightService;


@SpringBootTest
public class FlightServiceTest {

    @Autowired
    private FlightService service;

    @Test
    public void testSave() {

        Flight flight = new Flight(
                "510",
                "Air India",
                "Nagpur",
                "Mumbai",
                4500.0
        );

        Flight saved =
                service.save(flight);

        assertNotNull(saved);
    }

    @Test
    public void testFindByCode() {

        Flight flight =
                service.findByCode("AI500");

        assertEquals(
                "Air India",
                flight.getCarrier()
        );
    }

    @Test
    public void testFindByCarrier() {

        List<Flight> flights =
                service.findByCarrier(
                        "Air India"
                );

        assertTrue(flights.size() > 0);
    }

    @Test
    public void testList() {

        List<Flight> flights =
                service.list();

        assertNotNull(flights);
    }

    @Test
    public void testDelete() {

        service.delete("AI500");

        Flight flight =
                service.findByCode("AI500");

        assertNull(flight);
    }
}
