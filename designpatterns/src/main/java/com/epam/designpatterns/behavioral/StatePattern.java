package com.epam.designpatterns.behavioral;
import java.io.*;

import com.epam.designpatterns.behavioral.Button;
public class StatePattern {
	public static void main(String[] args)throws IOException {
	InputStreamReader is = new InputStreamReader( System.in );
    Button btn = new Button();
    while (true) {
        System.out.print("Press 'Enter'");
        is.read();
        btn.push();
    }
	}
}

