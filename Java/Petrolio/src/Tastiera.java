import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tastiera {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String leggiStringa(String message) {
        System.out.println(message);
        String lettura = null;
        try {
            lettura = br.readLine();
        } catch (IOException e) {

        }
        return lettura;
    }
    public int leggiIntero(String message){
        try{
            return Integer.parseInt(this.leggiStringa(message));
        }catch(NumberFormatException e){
            return -1;
        }
    }
    public float leggiFloat(String message){
        try{
            return Float.parseFloat(this.leggiStringa(message));
        }catch(NumberFormatException e){
            return -1;
        }
    }
}
