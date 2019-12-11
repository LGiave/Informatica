import java.util.Scanner;
public class Prodotto extends Vendita {
    private int codice;
    private String Descrizione;
    private double Prezzo;
    Scanner myObj = new Scanner(System.in);

    public Prodotto(){
        System.out.println("Enter codice prodotto");
        codice = myObj.nextInt();
        System.out.println("Enter Descrizione prodotto");
        Descrizione= myObj.nextLine();
        System.out.println("Enter Prezzo prodotto");
        Prezzo = myObj.nextInt();

    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setPrezzo(double prezzo) {
        Prezzo = prezzo;
    }

    public double getPrezzo() {
        return Prezzo;
    }
}
