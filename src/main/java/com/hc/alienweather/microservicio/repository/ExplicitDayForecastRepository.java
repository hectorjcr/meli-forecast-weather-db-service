package com.hc.alienweather.microservicio.repository;

import com.hc.alienweather.microservicio.model.ExplicitDayForecast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExplicitDayForecastRepository extends MongoRepository<ExplicitDayForecast, String> {
    ExplicitDayForecast findByDay(String day);
    List<ExplicitDayForecast> findByWeatherOrderByDay(String weather);
    String countByWeatherEquals(String weather);
    String countAllByDay();
}
