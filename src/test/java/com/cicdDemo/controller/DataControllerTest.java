package com.cicdDemo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DataControllerTest {
	
	@Autowired
    DataController dataController;

    @Test
    void health() {
    	dataController = new DataController();
        assertEquals("HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    void version() {
    	dataController = new DataController();
        assertEquals("The actual version is 1.0.0", dataController.version());
    }

    @Test
    void nationsLength() {
    	dataController = new DataController();
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
    	dataController = new DataController();
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }
}
