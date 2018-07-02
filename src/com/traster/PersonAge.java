//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class PersonAge {
    private int id;
    private String name;
    private int age;
    private static int counter = 15;

    public PersonAge(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }

    }

    public int getId() {
        return this.id;
    }

    public static void displayCounter() {
        System.out.printf("Counter: %d \n", counter);
    }

    static {
        System.out.println("PersonAge.static initializer");
    }
}
