package com.epam.designpatterns.behavioral;

import com.epam.designpatterns.behavioral.State;

class ON extends State {
    private static ON state = new ON();

    private ON() {}

    public static State state() {
        return state;
    }
}
