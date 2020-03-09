package com.epam.designpatterns.structural;

public class BridgePattern{
	   public static void main(String[] args) {
	      Shape perfectSquare = new Square(new PerfectSquare());
	      Shape roundedSquare = new Square(new RoundedSquare());

	      perfectSquare.draw();
	      roundedSquare.draw();
	   }
	}
