package com.traster;

public class Account<T, S> implements Accountable<T, S> {
    private T id;
    private S sum;

    Account(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return this.id;
    }

    public S getSum() {
        return this.sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}
