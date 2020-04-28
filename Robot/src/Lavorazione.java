public class Lavorazione {
    private String nome;
    private int secondi;
    private Robot robotUtilizzato;

    public Lavorazione(String nome, int secondi, Robot robotUtilizzato) {
        this.nome = nome;
        this.secondi = secondi;
        this.robotUtilizzato = robotUtilizzato;
    }

    public String getNome() {
        return nome;
    }

    public int getSecondi() {
        return secondi;
    }

    public Robot getRobotUtilizzato() {
        return robotUtilizzato;
    }

    public double getCosto(){
        double costo=0;
        costo=robotUtilizzato.getCostoSec()*secondi;
        return costo;
    }
}
