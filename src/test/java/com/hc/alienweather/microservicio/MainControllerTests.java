package com.hc.alienweather.microservicio;

import com.hc.alienweather.microservicio.model.ExplicitDayForecast;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import javax.servlet.http.HttpServlet;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MicroservicioApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainControllerTests {
    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getUrl(){
        //return "http://localhost:"+port+"/api/v1/forecast";
        return "https://meli-forecast-db-microservice.herokuapp.com/api/v1/forecast";
    }

    @Test
    public void getDayForecast(){
        String as = getUrl();
        ExplicitDayForecast explicitDayForecast = restTemplate.getForObject(getUrl()+"/day/1",ExplicitDayForecast.class);
        System.out.println(explicitDayForecast.toString());
        assertNotNull(explicitDayForecast);
    }

    @Test
    public void getTotalRows(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(getUrl()+"totalrows", HttpMethod.GET,entity,String.class);
        assertNotNull(response.getBody());
    }

    @Test
    public void testGetAllByWeather(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(getUrl()+"/weather/Drought", HttpMethod.GET,entity,String.class);
        List<ExplicitDayForecast> explicitDayForecast = restTemplate.getForObject(getUrl()+"/weather/Rainy",List.class);
        System.out.println(explicitDayForecast.toString());
        assertNotNull(explicitDayForecast);
    }

    @Test
    public void testSaveDayForeCast(){
        ExplicitDayForecast explicitDayForecast = new ExplicitDayForecast("1080","Drought");
        ResponseEntity<ExplicitDayForecast> postResponse = restTemplate.postForEntity(getUrl(),explicitDayForecast,ExplicitDayForecast.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }



}
