package com.epam.designpatterns.behavioral;

public class LightsOffCmd implements Command{
	Light light;
	  public LightsOffCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOff();
	  }
}
