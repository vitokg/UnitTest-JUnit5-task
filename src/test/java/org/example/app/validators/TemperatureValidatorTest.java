package org.example.app.validators;

import org.example.app.exceptions.TemperatureOutOfRangeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureValidatorTest {

    TemperatureValidator temperatureValidator;

    @BeforeEach
    void setUp() {
        temperatureValidator = new TemperatureValidator();
    }

    @DisplayName("Test if temperature is in bounds.")
    @Test
    void test_If_Temperature_Is_In_Bounds() {
        assertEquals("Temperature is OK. Data can be obtained.", temperatureValidator.validateTemperature(25));
    }

    @DisplayName("Test if temperature is range lower bound.")
    @Test
    void test_If_Temperature_Is_In_Lower_Bound() {
        assertEquals("Temperature is OK. Data can be obtained.", temperatureValidator.validateTemperature(-10));
    }

    @DisplayName("Test if temperature is range upper bound.")
    @Test
    void test_If_Temperature_Is_In_Upper_Bound() {
        assertEquals("Temperature is OK. Data can be obtained.", temperatureValidator.validateTemperature(35));
    }

    @DisplayName("Test if temperature below lower limit throws exception.")
    @Test
    void test_If_Below_Limit_Temperature_Throws_Exception() {
        TemperatureValidator temperatureValidator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> temperatureValidator.validateTemperature(-11), "No exception.");
    }

    @DisplayName("Test if temperature above high limit throws exception.")
    @Test
    void test_If_Above_Limit_Temperature_Throws_Exception() {
        TemperatureValidator temperatureValidator = new TemperatureValidator();
        assertThrows(TemperatureOutOfRangeException.class, () -> temperatureValidator.validateTemperature(36), "No exception.");
    }

    @AfterEach
    void tearDown() {
        temperatureValidator = null;
    }

}
