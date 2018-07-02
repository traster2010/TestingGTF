//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

public class EventApp {
    public EventApp() {
    }

    public static void main(String[] args) {
        Button button1 = new Button(new ButtonClickHandler());
        button1.click();
        button1.click();
        Button buttonTV = new Button(new EventHandler() {
            private boolean on = false;

            public void execute() {
                if (this.on) {
                    System.out.println("TV on");
                    this.on = false;
                } else {
                    System.out.println("TV off");
                    this.on = true;
                }

            }
        });
        Button buttonPrint = new Button(new EventHandler() {
            public void execute() {
                System.out.println("Printing ...");
            }
        });
        buttonTV.click();
        buttonTV.click();
        buttonPrint.click();
    }
}
