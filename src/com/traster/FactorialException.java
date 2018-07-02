//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

class FactorialException extends Exception {
    private int number;

    public int getNumber() {
        return this.number;
    }

    FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }
}
