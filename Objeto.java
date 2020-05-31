import java.awt.image.*;  //imagenes
import javax.imageio.*; //imagenes

public class Objeto {
    protected BufferedImage imagen=null;

    public void Objeto(BufferedImage _imagen){
        this.imagen=_imagen;
    }

    public void paint(BufferedImage _imagen){

    }

}