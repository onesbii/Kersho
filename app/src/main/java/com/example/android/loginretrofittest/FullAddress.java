package com.example.android.loginretrofittest;

public class FullAddress {

    private String addressName, fullAddress, area, street, landMark, floor, apartmentNumber, buildingNumber;
    private float latitude, longitude;

    public FullAddress(String addressName, String fullAddress, String area,
                       String street, String landMark, String floor, String apartmentNumber,
                       String buildingNumber, float latitude, float longitude) {

        this.addressName = addressName;
        this.fullAddress = fullAddress;
        this.area = area;
        this.street = street;
        this.landMark = landMark;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
        this.buildingNumber = buildingNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public String getArea() {
        return area;
    }

    public String getStreet() {
        return street;
    }

    public String getLandMark() {
        return landMark;
    }

    public String getFloor() {
        return floor;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
