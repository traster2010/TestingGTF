//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

interface Printable {
    int OPEN = 1;
    int CLOSE = 0;

    default void print() {
        System.out.println("Undefined printable");
    }

    static void read() {
        System.out.println("Read printable");
    }
}
