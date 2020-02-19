public class Terrestri extends Pozzi {
    private float capacitaEstrattiva;
    private Terreni terreno;

    public Terrestri() {
        super();
    }

    public Terrestri(float capacitaEstrattiva, Terreni terreno) {
        this.capacitaEstrattiva = capacitaEstrattiva;
        terreno = terreno;
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
