
package com.traster;

interface Accountable<T, S> {
    T getId();

    S getSum();

    void setSum(S var1);
}
