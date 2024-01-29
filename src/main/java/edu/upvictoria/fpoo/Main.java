package edu.upvictoria.fpoo;


// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        Menu menu1 = new Menu();
        try {
            menu1.Principal();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
