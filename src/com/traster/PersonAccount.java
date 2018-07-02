//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class PersonAccount {
    private String name;
    PersonAccount.Account account;

    PersonAccount(String name, String password) {
        this.name = name;
        this.account = new PersonAccount.Account(password);
    }

    public void displayPerson() {
        System.out.printf("Person Name:%s\t Password:%s \n", this.name, this.account.password);
    }

    public class Account {
        String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.printf("Account Login: %s\t Password: %s \n", PersonAccount.this.name, this.password);
        }
    }
}
