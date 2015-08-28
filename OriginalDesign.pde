int x = 0;
int y = 0;
int z = 0;

int value = 0;

void setup() 
{
  size(400, 400);
}

void draw() 
{
  stroke(value);
  line(mouseX-15, mouseY, mouseX+15, mouseY);
  line(mouseX, mouseY-15, mouseX, mouseY+15); 
}

void keyPressed() 
{
  if (value == 0) {
    value = 255;
  } 
  else {
    value = 0;
  }
}

void mousePressed()
{
  x = (int)(Math.random()*256);
  y = (int)(Math.random()*256);
  z = (int)(Math.random()*256);
  background(x, y, z);
}
