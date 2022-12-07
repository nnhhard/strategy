package ru.iashinme.domain;

public class City {
    private String cityName;
    private String cityCaption;
    private int regionCode;

    public City(String cityName, String cityCaption, int regionCode) {
        this.cityCaption = cityCaption;
        this.cityName = cityName;
        this.regionCode = regionCode;
    }

    public void setCityCaption(String cityCaption) {
        this.cityCaption = cityCaption;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCaption() {
        return cityCaption;
    }

    public int getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }
}
