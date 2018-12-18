package com.hc.alienweather.microservicio.model;

import com.hc.alienweather.microservicio.entity.Point;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("full_weather_forecaster")
public class FullWeatherForecaster {

    @Id
    private String id;
    private String day;
    private String weather;
    private String perimeter;
    private List<Point> pointList;

    public FullWeatherForecaster(String id, String day, String weather, String perimeter, List<Point> pointList) {
        this.id = id;
        this.day = day;
        this.weather = weather;
        this.perimeter = perimeter;
        this.pointList = pointList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(String perimeter) {
        this.perimeter = perimeter;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(List<Point> pointList) {
        this.pointList = pointList;
    }

    @Override
    public String toString() {
        return "FullWeatherForecaster{" +
                "id='" + id + '\'' +
                ", day='" + day + '\'' +
                ", weather='" + weather + '\'' +
                ", perimeter='" + perimeter + '\'' +
                ", pointList=" + pointList +
                '}';
    }
}
