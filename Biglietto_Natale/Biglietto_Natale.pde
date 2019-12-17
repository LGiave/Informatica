import processing.sound.*;

color sky = color(12, 70, 130);
Time ls;
Tree t;
Snow classicSnow;
Suolo pavimento;
SoundFile file;
  PFont font;
  PImage img;
  PImage img2;
  
  String s = "Buon Natale";

void setup() {  //setup function called initially, only once
    img = loadImage("CandyCane1.png");
    img2= loadImage("gift.png");
    ls= new Time();
    t = new Tree();
    pavimento = new Suolo();
    classicSnow = new Snow(900);

 // file = new SoundFile(this, "sound.mp3");
 // file.play();
}

public void settings(){
  size(1920,1080);
}

public void draw(){
  background(0);
 
  fill(255,0,0);
  font = createFont("Miraculous&Christmas.ttf", 200);
  textSize(1000);
  textFont(font);
  text(s, width/2 - 150, height /2 -300, 500, 500);  // Text wraps within text box
  
  t.drawMe();
 
  int x = 300;
  int y = 415;
  stroke(255);
  fill(243,218,11);
  strokeWeight(1);
  beginShape();
  vertex(x, y-50); // 300 e 400
  vertex(x+14,y-20);
  vertex(x+47,y-15);
  vertex(x+23,y+7);
  vertex(x+29,y+40);
  vertex(x,y+25);
  vertex(x-29,y+40);
  vertex(x-23,y+7);
  vertex(x-47,y-15);
  vertex(x-14,y-20);
  endShape(CLOSE);
 
  ls.ciclo();
  classicSnow.letItSnow();
  image(img, 700, 690,150,200);
  image(img2,450,735,150,150);
  pavimento.drawSuolo();
  
}
