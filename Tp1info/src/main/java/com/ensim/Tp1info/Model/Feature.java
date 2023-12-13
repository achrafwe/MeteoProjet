package com.ensim.Tp1info.Model;

import java.util.Properties;

public class Feature {
    private String Type;
    private Geometrie geometry;
    private Properties properties;

    public Feature() {
    }

    public Feature(String type, Geometrie geometry, Properties properties) {
        Type = type;
        this.geometry = geometry;
        this.properties = properties;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setGeometry(Geometrie geometry) {
        this.geometry = geometry;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getType() {
        return Type;
    }

    public Geometrie getGeometry() {
        return geometry;
    }

    public Properties getProperties() {
        return properties;
    }


}
