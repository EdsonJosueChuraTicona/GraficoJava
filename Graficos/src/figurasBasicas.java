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

public class figurasBasicas extends PApplet {
  public void setup() {

// dibujando un punto
//point(200,200);

// dibujando una recta
//Nombre EDSON
//Letra E
line(20,20,20,120);
line(20,20,80,20);
line(80,20,80,40);
line(80,40,40,40);
line(40,40,40,60);
line(40,60,80,60);
line(80,60,80,80);
line(80,80,40,80);
line(40,80,40,100);
line(40,100,80,100);
line(80,100,80,120);
line(80,120,20,120);

//Letra D
line(100,20,100,120);
line(100,20,140,20);
line(140,20,160,40);
line(160,40,160,100);
line(160,100,140,120);
line(140,120,100,120);
line(120,40,140,40);
line(140,40,140,100);
line(140,100,120,100);
line(120,40,120,100);

//Letra S
line(180,20,240,20);
line(240,20,240,40);
line(240,40,200,40);
line(200,40,200,60);
line(200,60,240,60);
line(240,60,240,120);
line(240,120,180,120);
line(180,120,180,100);
line(180,100,220,100);
line(220,100,220,80);
line(220,80,180,80);
line(180,80,180,20);

//Letra O
line(260,20,320,20);
line(320,20,320,120);
line(320,120,260,120);
line(260,120,260,20);
line(280,40,300,40);
line(300,40,300,100);
line(300,100,280,100);
line(280,100,280,40);

//Letra N
line(340,20,360,20);
line(360,20,400,80);
line(400,80,400,20);
line(400,20,420,20);
line(420,20,420,120);
line(420,120,400,120);
line(400,120,360,60);
line(360,60,360,120);
line(360,120,340,120);
line(340,120,340,20);

// dibujando un triangulo
//triangle(200,300,300,100,100,100);

// dibujando un circulo
//ellipse(200,200,200,200);

// dibujando un elipse
//ellipse(200,200,200,300);

// dibujando un cuadrado
//rect(100,100,100,100);

// cdibujando un rectangulo
//rect(100,100,100,200);

// tamanho de la ventana

    noLoop();
  }

  public void settings() { 
size(440,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "figurasBasicas" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
