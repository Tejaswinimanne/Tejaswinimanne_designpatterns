package com.epam.designpatterns.behavioral;

import com.epam.designpatterns.behavioral.Button;
import com.epam.designpatterns.behavioral.ON;

class OFF extends State {
    private static OFF state = new OFF();
    private OFF() { }

    public static State state() {
        return state;
    }
    public void push(Button b) {
        b.setCurrent(ON.state());
        System.out.println("   turning ON");
    }
}
