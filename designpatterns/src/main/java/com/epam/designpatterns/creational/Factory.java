package com.epam.designpatterns.creational;

public class Factory {
	public ShapeFactory getShape(String shapeType){
	      if(shapeType.equals("RECTANGLE")){
	         return new Rectangle();    
	      }
	      return null;
	   }
}
