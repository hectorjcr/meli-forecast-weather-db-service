package com.hc.alienweather.microservicio.service;

import com.hc.alienweather.microservicio.entity.ForecastFinalReport;
import com.hc.alienweather.microservicio.model.FullWeatherForecaster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FullWeatherReport implements FullWeatherReportInterface{
    @Override
    public ForecastFinalReport getFinalWeatherReport(List<FullWeatherForecaster> forecasterList) {

        ForecastFinalReport forecastFinalReport = new
                ForecastFinalReport(0,0,0,0,0,0);

        return forecastFinalReport;

    }
}
