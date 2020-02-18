public abstract class Pozzi {
    private int codice;
    private boolean attivo;

    public Pozzi(int codice, boolean attivo) {
        this.codice = codice;
        this.attivo = attivo;
    }

    public Pozzi(){
        this.attivo=true;
        this.codice=0;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getCodice() {
        return codice;
    }
}
