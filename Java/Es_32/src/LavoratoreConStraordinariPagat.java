public class LavoratoreConStraordinariPagat extends Lavoratore {
    private int oreStrordinario;
    static float retribuzioneOraria=10.0f;

    public LavoratoreConStraordinariPagat(String nome,int livello, int oreStrordinario){
        super(nome,livello);
        this.oreStrordinario=oreStrordinario;
    }

    public String stampaStraordinari(){
        return "Straordinario : " + oreStrordinario;
    }

    public String stampaStipendio(){
        return " Stipendio = " +(super.getStipendio()+retribuzioneOraria*oreStrordinario);
    }

    @Override
    public String toString() {
        return super.toString() +  stampaStipendio() ;
    }
}
