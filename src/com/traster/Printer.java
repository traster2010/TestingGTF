//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class Printer {
    public Printer() {
    }

    public <T> void print(T[] items) {
        int var3 = items.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            System.out.println("item = " + items[var4]);
        }

    }
}
