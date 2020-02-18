public class Marini extends Pozzi {
    private float capacitaEstrattiva;
    private float profondita;

    public Marini () {
        super();
        this.capacitaEstrattiva= getCapacitaEstrattiva();
        this.profondita= getProfondita();
    }

    public float getCapacitaEstrattiva() {
        return capacitaEstrattiva;
    }

    public void setcapacitaEstrattiva(float capacitaEstrattiva) {
        capacitaEstrattiva = capacitaEstrattiva;
    }

    public float getProfondita() {
        return profondita;
    }

    public void setProfondita(float profondita) {
        this.profondita = profondita;
    }

    @Override
    public String toString() {
        return "Marini{" +
                "Codice=" + super.getCodice() +
                "Stato=" + super.isAttivo() +
                "capacitaEstrattiva=" + capacitaEstrattiva +
                ", profondita=" + profondita +
                '}';
    }
}
