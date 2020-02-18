import java.util.Vector;
public class Sito {
    private String nome;
    private String nazione;
    private float greggioEstratto;
    private float profonditaMediaPozzi;
    private Vector<Pozzi> pozzi;

    public Sito(){
        this.nome="";
        this.nazione="";
        pozzi=new Vector<Pozzi>();
    }

    public void addPozzo(Pozzi b){
        pozzi.add(b);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getNome() {
        return nome;
    }

    public String getNazione() {
        return nazione;
    }

    public void setGreggioEstratto() {
        float tot=0f;
        for(int k=0; k<pozzi.size();k++){
            if(pozzi.elementAt(k).isAttivo()==true && pozzi.elementAt(k) instanceof Terrestri ) {
                tot = tot + ((Terrestri) pozzi.elementAt(k)).getCapacitaEstrattiva();
            }else if(pozzi.elementAt(k).isAttivo()==true && pozzi.elementAt(k) instanceof Marini ) {
                tot = tot + ((Marini) pozzi.elementAt(k)).getCapacitaEstrattiva();
            }
        }
        this.greggioEstratto=tot;
    }

    public float getGreggioEstratto() {
        return greggioEstratto;
    }

    public void setProfonditaMediaPozzi() {
        int j=0;
        float profondita=0f;
        for (int k=0;k<pozzi.size();k++){
            if(pozzi.elementAt(k) instanceof Marini){
                j++;
                profondita=profondita+((Marini) pozzi.elementAt(k)).getCapacitaEstrattiva();
            }
        }
        this.profonditaMediaPozzi=profondita/j;
    }

    public float getProfonditaMediaPozzi() {
        return profonditaMediaPozzi;
    }

    @Override
    public String toString() {
        return "Sito{" +
                "nome='" + nome + '\'' +
                ", nazione='" + nazione + '\'' +
                ", greggioEstratto=" + greggioEstratto +
                ", profonditaMediaPozzi=" + profonditaMediaPozzi +
                ", pozzi=" + pozzi +
                '}';
    }
}