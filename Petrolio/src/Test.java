public class Test {
    public static void main(String[] args) {
        Tastiera t=new Tastiera();
        Petrolifera p = new Petrolifera();
        Sito s = new Sito();
        p.addSito(s);
        int codice=t.leggiIntero("Inserisci il codice");
        int attivo=t.leggiIntero("Inserisci 0 per attivo, 1 per non attivo");
        boolean a=true;
        if(attivo==0){
            a=true;
        }else if(attivo==1){
            a=false;
        }
        float cap=t.leggiFloat("Inserisci la capacità estrattiva: ");
        float profondita=t.leggiFloat("Inserisci la profondita: ");
        Marini pm = null;
        try {
            pm = new Marini(codice,a,cap,profondita);
        } catch (ValoreNonValido valoreNonValido) {
            valoreNonValido.printStackTrace();
        }
        p.elementAt(0).addPozzo(pm);
        Terrestri pt = new Terrestri();
        s.addPozzo(pt);
    }
}
