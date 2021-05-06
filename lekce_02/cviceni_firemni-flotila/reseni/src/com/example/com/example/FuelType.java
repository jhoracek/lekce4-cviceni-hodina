package com.example;

public enum FuelType {
    PETROL("benzin"),
    DIESEL("nafta"),
    PLUGIN_HYBRID("plug-in hybrid"),
    LPG("LPG");

    private String description;

    FuelType(String description) {
        this.description = description;
    }

    public String toString() {
        return description;
    }
}
