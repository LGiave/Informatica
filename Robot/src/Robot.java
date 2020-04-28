import java.util.Vector;

public class Robot {
    private String nome;
    private float costoSec;
    private Processore processore;
    private Vector<Memoria> memorie;
    private int nRam;

    public Robot(String nome, float costoSec, Processore processore, Memoria[] memorie) {
        this.nome = nome;
        this.costoSec = costoSec;
        this.processore = processore;
        memorie=new Memoria[4];
        this.nRam = 0;
    }

    public String getNome() {
        return nome;
    }

    public float getCostoSec() {
        return costoSec;
    }

    public void setCostoSec(float costoSec) {
        this.costoSec = costoSec;
    }

    public void addMemoria(Memoria ram){
        if(nRam<4){
            memorie.add(ram);
            nRam++;
        }
    }

    public void delMemoria(Memoria ram){
        for(int i=0;i<4;i++){
            if(memorie.elementAt(i).getGB()==ram.getGB() && memorie.elementAt(i).getMarca()==ram.getMarca()){
                memorie.remove(memorie.elementAt(i));
                nRam--;
            }
        }
    }

    public void setProcessore(Processore processore) {
        this.processore = processore;
    }

    public Processore getProcessore() {
        return processore;
    }

    public Vector<Memoria> getMemorie() {
        return memorie;
    }
}
