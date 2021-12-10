import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
	// grass/sky   
    background(0,255,128);
    noStroke();
    fill(135,206,235);
    rect(0,0,600,300);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	 // sun drawing 
	 stroke(150);
	 fill(253,184,19);
	 ellipse(0,0,180,180);
	 // house
	 fill(155,99,76);
	 rect(175,150,200,200);
	 // roof
	 noStroke();
	 fill(242,223,180);
	 triangle(175,150,375,150,275,75);
	 // door
	 noStroke();
	 fill(0,0,0);
	 rect(210,220,130,130);
	 //windows
	 rect(230,180,30,30);
	 rect(280,180,30,30);
	 
  }
}