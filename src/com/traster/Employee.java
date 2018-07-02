//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public final class Employee extends Person {
    private String bank;

    public Employee(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    public String getCompany() {
        return this.bank;
    }

    public void display() {
        System.out.printf("Employee Name: %s Bank: %s \n", this.getName(), this.bank);
    }

    public void work() {
        System.out.printf("%s work in %s \n", this.getName(), this.bank);
    }
}
