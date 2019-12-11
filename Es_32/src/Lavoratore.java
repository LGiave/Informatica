public class Lavoratore {
    private String nome;
    private int livello;
    private float stipendio;

    public Lavoratore(String nome, int livello){
        this.nome=nome;
        this.livello=livello;
    }

    public String stampaStipendio(){
        return "stipendio = " + stipendio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public float getStipendio() {
        return stipendio;
    }

    public int getLivello() {
        return livello;
    }

    @Override
    public String toString() {
        return nome + " " + livello +  " " + stipendio;
    }
}
