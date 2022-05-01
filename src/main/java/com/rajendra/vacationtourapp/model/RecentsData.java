package com.rajendra.vacationtourapp.model;

import java.util.ArrayList;
import java.util.List;

public class RecentsData {

    String placeName;
    String cityName;
    String price;
    Integer imageUrl;
    ArrayList<Integer> galleryImages;

    public RecentsData(String placeName, String cityName, String price, Integer imageUrl, List<Integer> galleryImages) {
        this.placeName = placeName;
        this.cityName = cityName;
        this.price = price;
        this.imageUrl = imageUrl;
        this.galleryImages = new ArrayList<>(galleryImages);
    }

    public ArrayList<Integer> getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(ArrayList<Integer> galleryImages) {
        this.galleryImages = galleryImages;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
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
}
