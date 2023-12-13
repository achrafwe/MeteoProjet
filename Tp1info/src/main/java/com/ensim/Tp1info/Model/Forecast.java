package com.ensim.Tp1info.Model;

public class Forecast {
    public int temp2m;
    public int weather;
    public int tmin;
    public int tmax;

    public int getTmin() {
        return tmin;
    }

    public int getTmax() {
        return tmax;
    }

    public void setTmin(int tmin) {
        this.tmin = tmin;
    }

    public void setTmax(int tmax) {
        this.tmax = tmax;
    }

    public void setTemp2m(int temp2m) {
        this.temp2m = temp2m;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTemp2m() {
        return temp2m;
    }

    public int getWeather() {
        return weather;
    }
}
