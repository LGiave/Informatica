public class C extends Robot {
    private Materiale materiale;

    public C(String nome, float costoSec, Processore processore, Memoria[] memorie, int nRam, Materiale materiale) {
        super(nome, costoSec, processore, memorie);
        this.materiale = materiale;
    }
}
