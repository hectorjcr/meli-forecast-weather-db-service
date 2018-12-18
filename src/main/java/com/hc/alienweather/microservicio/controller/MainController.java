package com.hc.alienweather.microservicio.controller;

import com.hc.alienweather.microservicio.model.ExplicitDayForecast;
import com.hc.alienweather.microservicio.repository.ExplicitDayForecastRepository;
import com.hc.alienweather.microservicio.repository.FullWeatherForecasterRepository;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@CrossOrigin("*")
@Api(name="Controlador principal",
        description="Operaciones petinentes al control de data e informacion del clima",
        stage = ApiStage.RC)
public class MainController {

    @Autowired
    ExplicitDayForecastRepository forecastRepository;
    @Autowired
    FullWeatherForecasterRepository fullWeatherForecasterRepository;

    @RequestMapping(value = "/forecast/day/{day}")
    @ApiMethod(description = "Devuelve las condiciones del clima de un dia especifico")
    public ExplicitDayForecast getDayForecast(@ApiPathParam(name = "day",description = "dia a consultar") @PathVariable(value = "day")String day){
        return forecastRepository.findByDay(day);
    }

    //@ApiOperation(value = "Devuelve el numero de registros las predicciones climaticas", response = String.class)
    @RequestMapping(value = "/forecast/totalrows")
    @ApiMethod(description = "Devuelve el numero de registros las predicciones climaticas")
    public ResponseEntity<String> getTotalRows(){
        String result = Long.toString(forecastRepository.count());
        return ResponseEntity.ok().body(result);
    }

    //@ApiOperation(value = "Devuelve una lista de registros de clima para un tipo especifico", response = List.class)
    @RequestMapping(value = "/forecast/weather/{weather}")
    @ApiMethod(description = "Devuelve una lista de registros de clima para un tipo especifico")
    public List<ExplicitDayForecast> getAllByWeather(@ApiPathParam(name = "weather", description = "El dia a consultar")
                                                         @PathVariable(value = "weather") String weather){
        return forecastRepository.findByWeatherOrderByDay(weather);
     }

    @PostMapping(value = "/forecast")
    @ApiMethod(description = "Guarda un registro de clima para un dia especifico")
    public ExplicitDayForecast saveDayForeCast(@Valid @RequestBody ExplicitDayForecast dayForecast){
        ExplicitDayForecast existingDay = forecastRepository.findByDay(dayForecast.getDay());
        if(existingDay != null)
            return forecastRepository.save(existingDay);
        return forecastRepository.save(dayForecast);
    }
/*
    @RequestMapping(value = "/forecast/finalreport")
    public ForecastFinalReport getfinalWeatherReport(){
        ForecastFinalReport forecastFinalReport = new ForecastFinalReport();
        forecastFinalReport.setRainyPeriods(Integer.parseInt(fullWeatherForecasterRepository.countByWeatherEquals("Rainy")));
        return forecastFinalReport;
    }*/
}
