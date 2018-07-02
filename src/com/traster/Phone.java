//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class Phone implements Comparable<Phone> {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Phone o) {
        int result = this.name.compareTo(o.getName());
        if (result > 0) {
            result = this.price - o.getPrice();
        }

        return result;
    }
}
