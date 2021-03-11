package patternObserver;

import java.util.Observable;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.5f);
        weatherData.setMeasurements(75,69,31.2f);
        weatherData.setMeasurements(79,58,35.6f);
    }

}
