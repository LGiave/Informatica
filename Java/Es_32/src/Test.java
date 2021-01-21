public class Test {
    public static void main(String[] args) {
        String nome="Giovanni";
        int livello=2;
        float stipendio=800f;

        String nome1="Fabrizio";
        int livello1=0;
        float stipendio1=700f;
        int ore = 12;

        Lavoratore Giovanni= new Lavoratore(nome,livello);
        Giovanni.setStipendio(stipendio);

        Lavoratore Fabrizio= new LavoratoreConStraordinariPagat(nome1,livello1,ore);
        Fabrizio.setStipendio(stipendio1);

        System.out.println(Giovanni.toString());
        System.out.println(Fabrizio.toString());
    }
}
