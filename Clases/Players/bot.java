package Clases.Players;
import java.util.Random;

public class bot extends player {


    public bot(String nombre, String figura) {
        super(nombre, figura);
    }

    public int elegirMovimiento() {
        Random random = new Random();
        return random.nextInt(8)+1; 
        
        }
    
}
