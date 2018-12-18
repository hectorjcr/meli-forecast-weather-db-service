package com.hc.alienweather.microservicio;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class MicroservicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicioApplication.class, args);
    }

}

