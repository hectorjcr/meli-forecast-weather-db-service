package com.hc.alienweather.microservicio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "explicit_forecast_day")
public class ExplicitDayForecast {

    @Id
    private String _id;
    private String day;
    private String weather;

    public ExplicitDayForecast(String day, String weather) {
        this.day = day;
        this.weather = weather;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "ExplicitDayForecast{" +
                "_id='" + _id + '\'' +
                ", day='" + day + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
