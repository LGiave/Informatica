import java.util.Vector;

public class Malattia {
    private Vector <Focolaio> casi;
    private String nome;
    private float t_rad;

    public Malattia(String nome, float t_rad){
        this.nome = nome;
        this.t_rad = (t_rad >= 0 ) ? t_rad: 1;
        casi = new Vector<Focolaio>();
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addFocolaio(Focolaio f){
        casi.addElement(f);
    }

    public void addFocolaio(String nome, int infetti, int tempo){
        Focolaio f = new Focolaio(nome,infetti,tempo);
        casi.addElement(f);
    }

    public void sett_rad(int t_rad) {
        this.t_rad = (t_rad >= 0 ) ? t_rad: 1;
    }

    public float gett_rad() {
        return t_rad;
    }



    @Override
    public String toString() {
        String out = this.nome + String.format("\n");
        for(int i = 0; i < casi.size(); i++){
            out += String.format("%s\n" , casi.elementAt(i).toString());
        }
        return out;
    }
}