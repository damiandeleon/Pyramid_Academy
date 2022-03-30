package com.company;

public class Address implements StudentInfo{
    private String city = "Lubbock";
    private String state = "Texas";
    private String country = "USA";
    private String zipcode = "75402";

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }

    @Override
    public void returnAddress() {
        System.out.println("City" + city );
    }
}
