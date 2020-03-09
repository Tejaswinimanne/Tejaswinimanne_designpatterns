package com.epam.designpatterns.behavioral;

import com.epam.designpatterns.behavioral.OFF;
import com.epam.designpatterns.behavioral.State;

class Button {
    private State current;

    public Button() {
        current = OFF.state();
    }

    public void setCurrent(State s) {
        current = s;
    }

    public void push() {
        current.push(this);
    }
}
