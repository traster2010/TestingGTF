//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class Math {
    public Math() {
    }

    public static Math.Factorial getFactorial(int number) {
        int result = 1;

        for(int i = 0; i < number; ++i) {
            result *= i;
        }

        return new Math.Factorial(result, number);
    }

    public static class Factorial {
        private int result;
        private int key;

        Factorial(int result, int key) {
            this.result = result;
            this.key = key;
        }

        public int getResult() {
            return this.result;
        }

        public int getKey() {
            return this.key;
        }
    }
}
