package org.example.app.exceptions;

public class TemperatureOutOfRangeException extends RuntimeException {

        public TemperatureOutOfRangeException(String msg) {
            super(msg);
        }
}
