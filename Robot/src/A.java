public class A extends Robot {

    private int spessoreTaglio;
    private int precisione;

    public A(String nome, float costoSec, Processore processore, Memoria[] memorie, int nRam, int spessoreTaglio, int precisione) {
        super(nome, costoSec, processore, memorie);
        this.spessoreTaglio = spessoreTaglio;
        this.precisione = precisione;
    }

    public int getPrecisione() {
        return precisione;
    }

    public int getSpessoreTaglio() {
        return spessoreTaglio;
    }
}
