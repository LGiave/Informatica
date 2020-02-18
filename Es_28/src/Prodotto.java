import java.util.Vector;
public class Prodotto {
    private String Titolo;
    private String Genere;
    private float Prezzo;
    private boolean Noleggiato;

    public Prodotto(){
        this.Titolo="";
        this.Genere="";
        this.Prezzo=2f;
        this.Noleggiato=false;
    }

    public Prodotto(String titolo,String genere,float prezzo,boolean noleggiato){
        setTitolo(titolo);
        setGenere(genere);
        setPrezzo(prezzo);
        setNoleggiato(noleggiato);
    }

    public String getTitolo() {
        return Titolo;
    }

    public String getGenere() {
        return Genere;
    }

    public float getPrezzo() {
        return Prezzo;
    }

    public boolean isNoleggiato() {
        return Noleggiato;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public void setGenere(String genere) {
        if(genere.equals("Horror")||genere.equals("Dramma")||genere.equals("Avventura")||genere.equals("Bambini")) {
            Genere = genere;
        }
    }

    public void setPrezzo(float prezzo) {
        this.Prezzo = (prezzo>=2.0f)? prezzo:2.0f;
    }

    public void setNoleggiato(boolean noleggiato) {
        this.Noleggiato = noleggiato;
    }
}
