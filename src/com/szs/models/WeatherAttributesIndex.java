package com.szs.models;

public enum WeatherAttributesIndex {
    CLIMA (0),
    PADRES (1),
    ECONOMICA (2),
    PANORAMA (3);
    //NATIONALITY (3),
    //GO (4);

    private int index;

    WeatherAttributesIndex(int index) {
        this.index = index;
    }

    public static WeatherAttributesIndex newInstance(int index) {
        for (WeatherAttributesIndex weatherAttributesIndex : WeatherAttributesIndex.values()) {
            if (index == weatherAttributesIndex.index) {
                return weatherAttributesIndex;
            }
        }
        throw new IllegalArgumentException("Index not found");
    }

    public int getIndex() {
        return index;
    }
}