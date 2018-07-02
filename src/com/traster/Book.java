//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;


public class Book implements Printable {
    private String name;
    private String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public void print() {
        System.out.printf("%s %s \n", this.name, this.author);
    }
}
