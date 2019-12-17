public class Time{
  float x,y;
  int dim;
  float r,g,b;
  color rgb;
  Circle cerchio;
  public Time(){
     x=30;
     dim=55;
     y=55;
     r=0;
     g=0;
     b=0;
     rgb = color(r,g,b);
     cerchio = new Circle();
  }
  
  public void ciclo(){
    cerchio.show(x,y,dim,rgb);
    boolean ver=true;
    for(int i=0;i<1920-dim;i++){
      r=r+0.001;
      g=205;
      b=239;
      x=x+0.005;
      background(rgb);
      if (cerchio.getX()<-10){
        rgb=color(248,243,053);
        x=30;
        y=55;
        if(ver){
          cerchio.show(x-30,y,dim,rgb);
        }else{
          rgb=color(255,255,255);
          cerchio.show(x-30,y,dim,rgb);
        }
      }
    
}
  }
}
