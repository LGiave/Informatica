import java.util.Vector;
public class Videoteca {
    private  Vector Noleggi;
    private Noleggio nol;

    public Videoteca(){
        Noleggi = new Vector(1,1);
        nol = new Noleggio();
        Noleggi.addElement(nol);
    }

    public String filmNoleggiati(String nome){
        String film="";
        if(nome.equals(nol.getNominativo())){
            film = film + "," + nol.getProdottoNoleggiato();
        }
        return film;
    }

    public float spesaTotale(String nome){
        float spesa=0f;
        if(nome.equals(nol.getNominativo())) {
            spesa=spesa + nol.costoNoleggio();
        }
        return spesa;
    }

    public String genere(String gen){
        String list="";
        if(gen.equals(nol.getProdottoNoleggiato())){
            list= list + "," + nol.getGenere();
        }
        return list;
    }

    public void EliminaCliente(String nome){
        if(nome.equals(nol.getNominativo())){
            Noleggi.removeElement(nol);
        }
    }

    public void EliminaFilm(String titolo){
        if(nol.getProdottoNoleggiato().equals(titolo)){
            nol.rimuoviFilm(titolo);
        }
    }
}
