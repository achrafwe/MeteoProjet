package com.ensim.Tp1info.Model;

import java.util.ArrayList;

public class Geometrie {
    private String Type;
    private ArrayList< Float > coordinates = new ArrayList< Float >();

    public Geometrie() {
    }

    public Geometrie(String type, ArrayList<Float> coordinates) {
        Type = type;
        this.coordinates = coordinates;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setCoordinates(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return Type;
    }

    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }
}
