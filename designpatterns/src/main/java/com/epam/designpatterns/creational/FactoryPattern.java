package com.epam.designpatterns.creational;

public class FactoryPattern {
	public static void main(String[] args) {
		Factory factory=new Factory();
		ShapeFactory shape1 = factory.getShape("RECTANGLE");
	    shape1.draw();
	}
}
