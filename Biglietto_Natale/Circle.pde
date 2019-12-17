public class Circle{
  private final float DIM_MIN = 2;
  private final float DIM_MAX = 10;
  private final float dim;
  private float x;
  private float y;
  private color fill;
  private color border;
  
  public Circle(){
    dim = random(DIM_MIN,DIM_MAX) + DIM_MIN;
    fill = color(255,255,255);
    border = color(0,0,0);
    x = random(0,1920);
    y = random(-1080,0);
  }
  
  public void setX(float x){
    this.x = x;
  }
  
  public void setY(float y){
    this.y = y;
  }
  
  public float getX(){
    return x;
  }
  
  public float getY(){
    return y;
  }
  
  public void show(){
    fill(fill);
    stroke(border);
    circle(x,y,dim);
  }
  
  public void show(float x, float y, int dim){
    //fill(fill);
    stroke(border);
    circle(x,y,dim);
  }
  
  public void show(float x, float y, int dim, color fill){
    //fill(fill);
    stroke(border);
    circle(x,y,dim);
  }
  
  
}
