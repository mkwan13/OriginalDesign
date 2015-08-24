import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

/*void setup()
{
size(200, 100);
}
void draw()
{
  ellipse(50,50,50,50);
}
*/

PShape alien, head, body;

public void setup() {
  size(100, 100, P2D);

  // Create the shape group
  alien = createShape(GROUP);

  // Make two shapes
  head = createShape(ELLIPSE, 25, 0, 50, 50);
  head.setFill(color(255));
  body = createShape(RECT, 25, 45, 50, 40);
  body.setFill(color(0));

  // Add the two "child" shapes to the parent group
  alien.addChild(body);
  alien.addChild(head);
}

public void draw() {
  background(204);
  translate(50, 15);
  shape(alien); // Draw the group
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
