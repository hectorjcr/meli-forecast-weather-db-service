package com.hc.alienweather.microservicio.entity;

public enum Weather {
    Foggy("Foggy"),
    Rainy("Rainy"),
    BestCondition("BestCondition"),
    Drought("Drought");

    private String description;

    private Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
