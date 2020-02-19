public class Terrestri extends Pozzi {
    private float capacitaEstrattiva;
    private Terreni terreno;

    public Terrestri() {
        super();
    }

    public Terrestri(int codice,boolean attivo, float capacitaEstrattiva, Terreni terreno) {
        super(codice,attivo);
        this.capacitaEstrattiva = capacitaEstrattiva;
        this.terreno = terreno;
    }

    public void setCapacitaEstrattiva(float capacitaEstrattiva) {
        this.capacitaEstrattiva = capacitaEstrattiva;
    }

    public float getCapacitaEstrattiva() {
        return capacitaEstrattiva;
    }

    public void setTerreno( Terreni Terreno) {
        Terreno = Terreno;
    }

    public Terreni getTerreno() {
        return terreno;
    }

    @Override
    public String toString() {
        return "Terrestri{" +
                "Codice=" + super.getCodice() +
                "Stato=" + super.isAttivo() +
                "capacitaEstrattiva=" + capacitaEstrattiva +
                ", Terreno='" + terreno + '\'' +
                '}';
    }
}
