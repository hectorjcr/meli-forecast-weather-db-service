package com.hc.alienweather.microservicio.service;

import com.hc.alienweather.microservicio.entity.ForecastFinalReport;
import com.hc.alienweather.microservicio.model.FullWeatherForecaster;

import java.util.List;

public interface FullWeatherReportInterface {
    final String RAINY = "Rainy";
    final String DROUGHT = "Drought";
    final String BEST_CONDITION = "Best Condition";
    final String NORMAL = "Foggy";

    ForecastFinalReport getFinalWeatherReport(List<FullWeatherForecaster> forecasterList);
}
