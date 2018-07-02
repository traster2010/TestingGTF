//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class PersonTree implements Comparable<PersonTree> {
    private String name;
    private int age;

    public PersonTree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int compareTo(PersonTree person) {
        return this.name.compareTo(person.getName());
    }
}
