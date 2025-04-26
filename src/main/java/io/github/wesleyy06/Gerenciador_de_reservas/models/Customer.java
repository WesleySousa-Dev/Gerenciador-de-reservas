package io.github.wesleyy06.Gerenciador_de_reservas.models;

public class Customer {
    private String name;
    private String lastname;
    private long phoneNumber;

    public Customer() {
    }

    public Customer(String name, String lastname, long phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
