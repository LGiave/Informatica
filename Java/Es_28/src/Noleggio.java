import java.util.Vector;
public class Noleggio {
    private String Nominativo;
    private String prodottoNoleggiato;
    private String dataPrestito;
    private String dataReso;
    private Vector prodotti;
    private Prodotto prod;
    private int g;


    public Noleggio(){
        prodotti= new Vector(1,1);
        prod = new Prodotto();
        prodotti.addElement(prod);
        Nominativo="";
        prodottoNoleggiato="";
        dataPrestito="";
        dataReso="";
        g=1;
    }

    public Noleggio(String nominativo, String prodottonoleggiato, String dataprestito, String datareso, int g){
        setNominativo(nominativo);
        setProdottoNoleggiato(prodottonoleggiato);
        setDataPrestito(dataprestito);
        setDataReso(datareso);
        setG(g);
    }

    public String getGenere(){
        return prod.getGenere();
    }

    public String getNominativo() {
        return Nominativo;
    }

    public String getProdottoNoleggiato() {
        return prodottoNoleggiato;
    }

    public String getDataPrestito() {
        return dataPrestito;
    }

    public String getDataReso() {
        return dataReso;
    }

    public int getG() {
        return g;
    }

    public void setNominativo(String nominativo) {
        Nominativo = nominativo;
    }

    public void setProdottoNoleggiato(String prodottoNoleggiato) {
        this.prodottoNoleggiato = prodottoNoleggiato;
    }

    public void setDataPrestito(String dataPrestito) {
        this.dataPrestito = dataPrestito;
    }

    public void setDataReso(String dataReso) {
        this.dataReso = dataReso;
    }

    public void setG(int g) {
        this.g = g;
    }

    public float costoNoleggio(){
        float tot=0;
        tot=(prod.getPrezzo()*g);
        return tot;
    }

    public boolean noleggiato(){
        if(prod.isNoleggiato()==true){
            return true;
        }else{
            return false;
        }
    }

    public void rimuoviFilm(String titolo) {
        if (titolo.equals(prod.getTitolo())) {
            prodotti.removeElement(prod);
        }else{
            System.out.println("Film inesistente");
        }
    }
}

