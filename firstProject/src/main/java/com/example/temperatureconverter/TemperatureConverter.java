package com.example.temperatureconverter;

// C° =  (5*(F°-32))/9
// F° = (9C° + (32*5))/5
public class TemperatureConverter {
    double toCelsius(int temperatureToConvert) {

        return (5 * (temperatureToConvert - 32)) / 9d;
    }

    double toFahrenheit(int temperatureToConvert) {
        return (double) (9 * temperatureToConvert + (32 * 5)) / 5;
    }
}
