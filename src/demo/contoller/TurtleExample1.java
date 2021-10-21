package demo.contoller;

import media.model.Turtle;
import media.model.World;

public class TurtleExample1 {
	  public static void main(String[] args) {
	    World earth;
	    Turtle oogway;
	    earth = new World();
	    oogway = new Turtle(earth);
	    oogway.forward(100);
	    oogway.turnRight();
	   }
	}

