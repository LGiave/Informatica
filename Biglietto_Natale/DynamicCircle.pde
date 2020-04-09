public class DynamicCircle extends Circle{
  private float speedX;
  private float speedY;
  
  public DynamicCircle(){
    super();  
    speedX = random(-1,1);
    speedY = random(1,4);
  }
  
  public void move(){
    setX(getX()+speedX);
    setY(getY()+speedY);
  }
}
