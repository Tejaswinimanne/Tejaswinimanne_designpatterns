package com.epam.designpatterns.behavioral;

public class LightsOnCmd implements Command{
	Light light;
	  public LightsOnCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOn();
	  }
}
