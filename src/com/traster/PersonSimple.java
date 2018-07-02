//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class PersonSimple {
    protected String name;
    protected int age;

    public PersonSimple() {
        this.name = "Undefined";
        this.age = 10;
    }

    public PersonSimple(String name) {
        this.name = name;
        this.age = 18;
    }

    public PersonSimple(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void displayInfo() {
        System.out.printf(" %s\t  %d \n ", this.name, this.age);
    }
}
