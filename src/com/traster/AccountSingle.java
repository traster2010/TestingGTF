package com.traster;

public class AccountSingle<T> {
    private T id;

    AccountSingle(T id) {
        this.id = id;
    }

    public T getId() {
        return this.id;
    }
}
