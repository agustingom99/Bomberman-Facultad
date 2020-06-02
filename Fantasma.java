import java.io.IOException;
import javax.imageio.ImageIO;

public class Fantasma extends Personaje {
    private int puntoFantasma;
    int Azul=0, Rosa=1;
    public Fantasma(int color){
        super("");
        try{
            if(color == Azul){
                imagen = ImageIO.read(getClass().getResource("imagenes/fantasma_azul.png"));
                this.puntoFantasma = 150;
            }
            if(color == Rosa){
                imagen = ImageIO.read(getClass().getResource("imagenes/fantasma_rosa.png"));
                this.puntoFantasma = 100;
            }
        }catch(IOException e){
            System.out.println("Error al cargar la imagen:");
        }
    }
}