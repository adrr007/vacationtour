package com.rajendra.vacationtourapp.model;

import java.util.ArrayList;
import java.util.List;

public class RecentsData {

    String placeName;
    String cityName;
    String price;
    ArrayList<Integer> images;
    String hyperlink;
    String about;

    public RecentsData(String placeName, String cityName, String price,  String hyperlink, String about, List<Integer> images) {
        this.placeName = placeName;
        this.cityName = cityName;
        this.price = price;
        this.hyperlink = hyperlink;
        this.about = about;
        this.images = new ArrayList<>(images);
    }

    public ArrayList<Integer> getImages() {
        return images;
    }

    public void setImages(ArrayList<Integer> images) {
        this.images = images;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHyperlink(){ return hyperlink;}

    public void setHyperlink(String hyperlink) { this.hyperlink = hyperlink; }

    public String getAbout() { return about; }

    public void setAbout(String about) { this.about = about; }
}
