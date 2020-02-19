public class Marini extends Pozzi {
    private float capacitaEstrattiva;
    private float profondita;

    public Marini () {
    }
    public Marini(int codice, boolean attivo,float cap,float prof) throws ValoreNonValido{
        super(codice,attivo);
        this.capacitaEstrattiva=cap;
        if(prof>0){
            this.profondita=prof;
        }else{
            throw new ValoreNonValido("La profondità non può essere negativa");
        }
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
