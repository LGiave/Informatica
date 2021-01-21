public class Test {
    public static void main(String[] args) {
        Malattia Covid_19 = new Malattia("Covid19" , 7.4f);
        Covid_19.addFocolaio("a" , 2, 3);
        Covid_19.addFocolaio("b" , 7, 4);
        Covid_19.addFocolaio("c" , 9, 5);
        Covid_19.addFocolaio("d" , 12, 1);

        System.out.println(Covid_19.toString());

        float g  = 0;
        for(int k = 1; k < 4356406;k *= 2){
            g += 7.4;
        }
        System.out.println("Ci vorrebbero " + g + " giorni per infettare tutti ");

        g = 0;
        for (int i = 1800; i > 1; i--){
            i /= 2;
            g += 7.4;
        }
        System.out.println("In Lomabardia il contagion e' partito " + g + " giorni fa.");
    }
}