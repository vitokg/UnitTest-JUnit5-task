package org.example.app;

import org.example.app.data.DataProvider;
import org.example.app.exceptions.TemperatureOutOfRangeException;
import org.example.app.validators.TemperatureValidator;

public class App {

    public static void main(String[] args) {
        getOutput(handleData());
    }

    private static String handleData() {
        DataProvider provider = new DataProvider();
        TemperatureValidator validator = new TemperatureValidator();
        try {
            return validator.validateTemperature(provider.getTemperature());
        } catch (TemperatureOutOfRangeException ex) {
           return ex.getMessage();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
