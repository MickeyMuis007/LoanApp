package Domain;

import java.io.Serializable;

import Domain.settings.Address;
import Domain.settings.Contact;

/**
 * Created by Riaan on 4/13/2016.
 */
public class Customer implements Serializable {
    private Long customerId;
    private String name;
    private String lastName;
    private Address address;
    private Contact contact;

    private Customer(){}

    public Long getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public Customer(Builder builder){
        customerId = builder.customerId;
        name = builder.name;
        lastName = builder.lastName;
        address = builder.address;
        contact = builder.contact;
    }

    public static class Builder{
        private Long customerId;
        private String name;
        private String lastName;
        private Address address;
        private Contact contact;

        public Builder(){
            name = "";
            lastName = "";
            address = null;
            contact = null;
        }
        public Builder customerId(Long value){
            customerId = value;
            return this;
        }
        public Builder name(String value){
            name = value;
            return this;
        }
        public Builder lastName(String value){
            lastName = value;
            return this;
        }
        public Builder address(Address value){
            address = value;
            return this;
        }
        public Builder contact(Contact value){
            contact = value;
            return this;
        }
        public Builder copy(Customer value){
            customerId = value.customerId;
            name = value.name;
            lastName = value.lastName;
            address = value.address;
            contact = value.contact;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return customerId.equals(customer.customerId);

    }

    @Override
    public int hashCode() {
        return customerId.hashCode();
    }
}