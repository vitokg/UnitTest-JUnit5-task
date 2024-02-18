package org.example.app.validators;

import org.example.app.exceptions.TemperatureOutOfRangeException;

public class TemperatureValidator {

    private static final int TEMPERATURE_LOWER_LIMIT = -10;
    private static final int TEMPERATURE_UPPER_LIMIT = 35;

    public String validateTemperature(int temperature)
            throws TemperatureOutOfRangeException {
        if (temperature >= TEMPERATURE_LOWER_LIMIT
                & temperature <= TEMPERATURE_UPPER_LIMIT) {
            return "Temperature is OK. Data can be obtained.";
        } else {
            throw new TemperatureOutOfRangeException("Temperature is out of working range: " + TEMPERATURE_LOWER_LIMIT + "°C - " + TEMPERATURE_UPPER_LIMIT + "°C.");
        }
    }
}
