public class B extends Robot{

    private int numPuntiSec;

    public B(String nome, float costoSec, Processore processore, Memoria[] memorie, int nRam, int numPuntiSec) {
        super(nome, costoSec, processore, memorie);
        this.numPuntiSec = numPuntiSec;
    }
}
