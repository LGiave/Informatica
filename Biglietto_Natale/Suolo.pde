public class Suolo {
 private Rettangolo rectNeve; 
 private Circle[] suolo;
 int max=200;
 float y=900;
 float x=0;
 int i;
  
  public Suolo(){
    suolo = new Circle[max];
    rectNeve = new Rettangolo();
    for(i=0;i<max;i++){
    suolo[i] = new Circle();
    }
  }
  public void drawSuolo(){
    
    for(int i =0;i<max;i++){
        suolo[i].show(x,y-10,40);
        x=x+30;
        if(x>1920){
          x=0;
        }
      }
      rectNeve.show(0,880,1920,200);
    }
  }
