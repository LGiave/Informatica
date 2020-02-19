import java.util.Vector;
public class Sito {
    private String nome;
    private String nazione;
    private Vector<Pozzi> pozzi;
    private int codice;

    public Sito(){
        this.nome="";
        this.nazione="";
        pozzi=new Vector<Pozzi>();
        codice=0;
    }

    public void addPozzo(Pozzi b){
        b.setCodice(this.codice);
        codice++;
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

    public float greggioEstratto() {
        float tot=0f;
        for(int k=0; k<pozzi.size();k++){
            if(pozzi.elementAt(k).isAttivo()){
                tot = tot + pozzi.elementAt(k).getCapacitaEstrattiva();
            }
        }
        return tot;
    }

    public float profonditaMediaPozzi() {
        int j=0;
        float profondita=0f;
        for (int k=0;k<pozzi.size();k++){
            if(pozzi.elementAt(k) instanceof Marini){
                j++;
                profondita=profondita+(pozzi.elementAt(k)).getCapacitaEstrattiva();
            }
        }
        return profondita/j;
    }

    @Override
    public String toString() {
        return "Sito{" +
                "nome='" + nome + '\'' +
                ", nazione='" + nazione + '\'' +
                ", greggioEstratto=" + greggioEstratto() +
                ", profonditaMediaPozzi=" + profonditaMediaPozzi() +
                ", pozzi=" + pozzi +
                '}';
    }
}