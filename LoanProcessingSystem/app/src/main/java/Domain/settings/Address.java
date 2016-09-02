package Domain.settings;

import java.io.Serializable;

/**
 * Created by Riaan on 8/24/2016.
 */
public class Address implements Serializable{
    private String line1;
    private String line2;
    private String line3;
    private int postalCode;
    private String city;
    private String province;
    private String country;

    private Address(){}

    public Address(Builder builder){
        line1 = builder.line1;
        line2 = builder.line2;
        line3 = builder.line3;
        postalCode = builder.postalCode;
        city = builder.city;
        province = builder.province;
        country = builder.country;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public static class Builder{
        private String line1;
        private String line2;
        private String line3;
        private int postalCode;
        private String city;
        private String province;
        private String country;

        public Builder(){
            line1 = "";
            line2 = "";
            line3 = "";
            postalCode = -1;
            city = "";
            province = "";
            country = "";
        }
        public Builder line1(String value){
            line1 = value;
            return this;
        }
        public Builder line2(String value){
            line2 = value;
            return this;
        }
        public Builder line3(String value){
            line3 = value;
            return this;
        }
        public Builder postalCode(int value){
            postalCode = value;
            return this;
        }
        public Builder city(String value){
            city = value;
            return this;
        }
        public Builder province(String value){
            province = value;
            return this;
        }
        public Builder country(String value){
            country = value;
            return this;
        }
        public Builder copy(Address value){
            line1 = value.line1;
            line2 = value.line2;
            line3 = value.line3;
            postalCode = value.postalCode;
            city = value.city;
            province = value.province;
            country = value.country;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}
