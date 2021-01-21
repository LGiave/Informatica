public class Focolaio {
    private String nome;
    private int infetti;
    private int tempo;

    public Focolaio(String nome, int infetti, int tempo){
        this.nome = nome;
        this.infetti = (infetti>=0) ? infetti: 0;
        this.tempo = (tempo >= 0) ? tempo: 0;
    }

    public String getNome() {
        return nome;
    }

    public int getinfetti() {
        return infetti;
    }

    public int getTempo() {
        return tempo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setinfetti(int infetti) {
        this.infetti = (infetti>=0) ? infetti: 0;
    }

    public void setTempo(int tempo) {
        this.tempo = (tempo >= 0) ? tempo: 0;
    }

    @Override
    public String toString() {
        return this.nome + ", numero infetti: " + this.infetti + ", tempo trascorso dal primo contagio: " + this.tempo;
    }
}