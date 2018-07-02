//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class Transaction<T extends Account<String, Integer> & Accountable<String, Integer>> {
    private T from;
    private T to;
    private int sum;

    Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    void execute() {
        if ((Integer)this.from.getSum() >= this.sum) {
            this.from.setSum((Integer)this.from.getSum() - this.sum);
            this.to.setSum((Integer)this.to.getSum() + this.sum);
            System.out.printf("Transaction Account: %s Sum: %d\n Account: %s Sum: %d ", this.from.getId(), this.from.getSum(), this.to.getId(), this.to.getSum());
        } else {
            System.out.println("Not have payment");
        }

    }
}
