import java.util.Scanner;
public class Vendita  {
    private Data data;
    private Prodotto prodotto;
    private int codVenditore;
    private int quantita;
    private int metodo;
    private double incTotale;
    Scanner myObj = new Scanner(System.in);

    public int getCodVenditore() {
        return codVenditore;
    }

    public Vendita(){
        System.out.println("Enter codice prodotto");
        this.prodotto.setCodice(myObj.nextInt());
        System.out.println("Enter Descrizioe prodotto");
        this.prodotto.setDescrizione(myObj.nextLine());
        System.out.println("Enter prezzo");
        this.prodotto.setPrezzo(myObj.nextInt());
        System.out.println("Enter anno");
        this.data.a = myObj.nextInt();
        System.out.println("Enter mese");
        this.data.m= myObj.nextInt();
        System.out.println("Enter giorno");
        this.data.g = myObj.nextInt();
        System.out.println("Enter codice venditore da  0 a 9");
        this.codVenditore= myObj.nextInt();
        System.out.println("Enter quantità Prodotto");
        quantita= myObj.nextInt();
        System.out.println("Enter metodo di pagamento");
        this.metodo= myObj.nextInt();
    }

    public int getMetodo() {
        return metodo;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void incTotale(double prezzo){
        this.incTotale=prezzo*quantita;
    }

    public double getIncTotale() {
        return incTotale;
    }
}
