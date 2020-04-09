public class Neve{
  private int nFiocchi;  //numero di fiocchi di neve
  private final int MAX_Neve = 1000;
  private final int MIN_Neve = 150;
  DynamicCircle[] nevicata;
  
  
  //funzione che disegna fiocchi
  public Neve(int nFiocchi){
    this.nFiocchi = (nFiocchi >= MIN_Neve && nFiocchi <= MAX_Neve) ? nFiocchi: MIN_Neve;
    
    //vettore di fiocchi
    nevicata = new DynamicCircle[this.nFiocchi];
    for(int i = 0; i < this.nFiocchi; i++){
      nevicata[i] = new DynamicCircle();
    }
  }
  
  public Neve(){
    
  }
  
  //funzione che fa cadere i fiocchi
  public void cadutaNeve(){
    for(int i = 0; i < nFiocchi; i++){
      //decremneto x e y
      nevicata[i].show();
      nevicata[i].move();
      
      //se sono fuori dallo schermo i fiocchi ricompaiono in alto 
      if(nevicata[i].getY() > 1080+5){
        nevicata[i].setY(random(-1080,0));
      }
      if(nevicata[i].getX() > 1920+5 || nevicata[i].getX()<-5){
        nevicata[i].setY(random(0,1920));
      }
    }
  }
  
  public int getnFiocchi(){
    return nFiocchi;
  }  
}
