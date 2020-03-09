package com.epam.designpatterns.structural;

public class Square extends Shape {
	   public Square(DrawAPI drawAPI) {
	      super(drawAPI);
	   }

	   public void draw() {
	      drawAPI.drawSquare();
	   }
	}
