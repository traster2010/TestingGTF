//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

import java.util.Optional;

public class Customer {
    private String name;
    private Optional<Address> address = Optional.empty();

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Address> getAddress() {
        return this.address;
    }

    public void setAddress(Optional<Address> address) {
        this.address = address;
    }
}
