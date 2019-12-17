public class Snow{
  private int snowflakes;  //numero di fiocchi di neve
  private final int MAX_SNOW = 1000;
  private final int MIN_SNOW = 150;
  DynamicCircle[] snowFall;
  
  
  //funzione che disegna fiocchi di neve sullo schermo
  public Snow(int snowflakes){
    this.snowflakes = (snowflakes >= MIN_SNOW && snowflakes <= MAX_SNOW) ? snowflakes: MIN_SNOW;
    
    //creo il vettore di fiocchi e li istanzio
    snowFall = new DynamicCircle[this.snowflakes];
    for(int i = 0; i < this.snowflakes; i++){
      snowFall[i] = new DynamicCircle();
    }
  }
  
  public Snow(){
    
  }
  
  //funzione che fa cadere i fiocchi
  public void letItSnow(){
    for(int i = 0; i < snowflakes; i++){
      //decremneto x e y
      snowFall[i].show();
      snowFall[i].move();
      
      //se sono fuori dallo schermo i fiocchi ricompaiono in alto 
      if(snowFall[i].getY() > 1080+5){
        snowFall[i].setY(random(-1080,0));
      }
      if(snowFall[i].getX() > 1920+5 || snowFall[i].getX()<-5){
        snowFall[i].setY(random(0,1920));
      }
    }
  }
  
  public int getSnowflakes(){
    return snowflakes;
  }  
}
