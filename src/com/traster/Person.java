//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

import java.util.Objects;

public class Person implements Cloneable, Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Person Name: %s \n", this.name);
    }

    public String toString() {
        return "Person " + this.name;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else {
            return !(o instanceof Person) ? false : Objects.equals(this.name, ((Person)o).name);
        }
    }

    public int hashCode() {
        return 10 * this.name.hashCode() + 20456;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
