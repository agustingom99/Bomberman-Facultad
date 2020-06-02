import java.awt.*;
import java.awt.image.*;  //imagenes
import javax.imageio.*; //imagenes
import java.io.IOException;
import java.awt.geom.*;

public class Objeto {
    protected BufferedImage imagen = null;

    public Objeto(String img){
        try{
            imagen = ImageIO.read(getClass().getResource(img));
        }catch(IOException e){
            System.out.println("Error al cargar la imagen:");
            System.out.println(img+"+>"+this.getClass().getResource(img));
        }
    }

    public void paint(BufferedImage _imagen){

    }

}