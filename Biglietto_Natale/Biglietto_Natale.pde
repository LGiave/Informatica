import ddf.minim.*;

  Stella stella;
  color sky = color(12, 70, 130);
  Tree t;
  Neve neve;
  Suolo pavimento;
  PFont font;
  PImage img;
  PImage img2;
  PImage img3;
  PImage img4;
  int x=50;
  String s = "Buon Natale";
  Minim minim;
  AudioPlayer player;

void setup() {  //setup function called initially, only once
    int x=50;
    int y=50;
    img = loadImage("CandyCane1.png");
    img2= loadImage("gift.png");
    img3= loadImage("slitta.png");
    img4= loadImage("Snowman.png");
    t = new Tree();
    pavimento = new Suolo();
    neve = new Neve(900);
    stella= new Stella();
    minim=new Minim(this);
    player= minim.loadFile("Music.mp3");
    player.loop();
}

public void settings(){
  size(1920,1080);
}

public void draw(){

  background(0);
  x=x+5;
  if(x>2000){
    x=-600;
  }
  fill(255,0,0);
  font = createFont("Miraculous&Christmas.ttf", 200);
  textSize(1000);
  textFont(font);
  text(s, width/2 - 150, height /2 -300, 500, 500);  
  t.drawMe();
  neve.cadutaNeve();
  image(img, 700, 690,150,200);
  image(img2,450,735,150,150);
  image(img3,x,5,600,200);
  image(img4,1500,735-200,250,400);
  pavimento.drawSuolo();
  stella.stella();
}
