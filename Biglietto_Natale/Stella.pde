public class Stella {
  private int x, y;

  public void stella() {
    int x = 300;
    int y = 415;
    
    fill(243, 218, 11);
    stroke(243, 218, 11);
    beginShape();
    vertex(x, y-50); // 300 e 400
    vertex(x+14, y-20);
    vertex(x+47, y-15);
    vertex(x+23, y+7);
    vertex(x+29, y+40);
    vertex(x, y+25);
    vertex(x-29, y+40);
    vertex(x-23, y+7);
    vertex(x-47, y-15);
    vertex(x-14, y-20);
    endShape(CLOSE);
  }
}
