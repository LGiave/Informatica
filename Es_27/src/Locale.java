import java.util.Scanner;

public class Locale {
    private Vendita[] venditori;
    private int i;
    private int max = 0;
    private int n;
    private double vendita_max;
    private double incasso;
    private double incassoTotale;

    Scanner myObj = new Scanner(System.in);

    public void setIncasso(double incasso) {
        this.incasso = incasso;
    }

    public void BestVenditore(){
        for(i=0;i<10;i++) {
            if (venditori[i].getQuantita()> max) {
                max = venditori[i].getQuantita();
                n = i;
            }
        }
        System.out.println("Il miglior venditore è " + venditori[n] + "ha venduto" + max + " Prodotti");
    }

    public void venditaMax(){
        for (int i=0;i<10;i++) {
            if (venditori[i].getMetodo() == 2 && incasso > vendita_max) {
                vendita_max = incasso;
            }
        }
        System.out.println("La vendita con incasso maggiore di importo " + vendita_max +"€");
    }

    public void checkVenditore(){
        int venditore;
        System.out.println("Enter codice venditore");
        venditore= myObj.nextInt();
        if(venditori[venditore].getCodVenditore()>0){
            System.out.println("IL seguente venditore ha venduto: " + venditori[venditore].getProdotto() + "quantita: "+ venditori[venditore].getQuantita() + "incasso totale: "+ venditori[venditore].getIncTotale());
        }else{
            System.out.println("Errore!");
        }

    }

    public void incassoTotale(){
        for(i=0;i<10;i++){
            incassoTotale=incassoTotale+venditori[i].getIncTotale();
        }
        System.out.println(incassoTotale);
    }
}
