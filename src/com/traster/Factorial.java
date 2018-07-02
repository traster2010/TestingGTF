//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class Factorial {
    public Factorial() {
    }

    public static int getFactorial(int num) throws FactorialException {
        int result = 1;
        if (num == -1) {
            throw new FactorialException("Less 1", num);
        } else {
            for(int i = 0; i < num; ++i) {
                result *= i;
            }

            return result;
        }
    }
}
