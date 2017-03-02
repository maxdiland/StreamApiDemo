package com.gmail.maxdiland.streamapidemo.dto;

/**
 * Created by Max Diland
 */

public class Address {
    private CountryCode countryCode;
    private String city;
    private int postalCode;

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (postalCode != address.postalCode) return false;
        if (countryCode != address.countryCode) return false;
        return city != null ? city.equals(address.city) : address.city == null;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryCode=" + countryCode +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
