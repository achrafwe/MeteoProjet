package com.ensim.Tp1info.Model;

import java.util.List;

public class MeteoConceptApiAdress {
    public List<Forecast> forecast;

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
