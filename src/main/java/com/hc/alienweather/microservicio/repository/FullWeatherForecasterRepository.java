package com.hc.alienweather.microservicio.repository;

import com.hc.alienweather.microservicio.entity.ForecastFinalReport;
import com.hc.alienweather.microservicio.model.FullWeatherForecaster;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FullWeatherForecasterRepository extends MongoRepository<FullWeatherForecaster, String> {

}
