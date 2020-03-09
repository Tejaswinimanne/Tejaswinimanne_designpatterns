package com.epam.designpatterns.behavioral;

import com.epam.designpatterns.behavioral.Button;

public class State {
	public void push(Button b) {
        b.setCurrent(OFF.state());
        System.out.println("   turning OFF");
    }
}

