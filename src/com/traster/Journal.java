//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;


public class Journal implements Printable {
    String name;

    Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void print() {
        System.out.printf("%s \n", this.name);
    }
}
