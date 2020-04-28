public class Processore {
    private String marca;
    private String modello;
    private int velClock;

    public Processore(String marca, String modello, int velClock) {
        this.marca = marca;
        this.modello = modello;
        this.velClock = velClock;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getVelClock() {
        return velClock;
    }
}
