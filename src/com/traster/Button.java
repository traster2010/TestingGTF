//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.traster;

class Button {
    EventHandler handler;

    Button(EventHandler action) {
        this.handler = action;
    }

    public void click() {
        this.handler.execute();
    }
}
