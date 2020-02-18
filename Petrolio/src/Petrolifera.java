import java.util.Vector;

public class Petrolifera {
    private Vector<Sito> siti;

    public Petrolifera() {
        siti=new Vector<Sito>();
    }

    public void addSito(Sito a){
        siti.add(a);
    }

}
