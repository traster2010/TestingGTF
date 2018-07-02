//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class Client extends Person {
    private String bank;

    Client(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    public void display() {
        System.out.printf("Client Name: %s Bank: %s \n", this.getName(), this.bank);
    }

    public String getBank() {
        return this.bank;
    }

    public String toString() {
        return "Client " + this.getName();
    }
}
