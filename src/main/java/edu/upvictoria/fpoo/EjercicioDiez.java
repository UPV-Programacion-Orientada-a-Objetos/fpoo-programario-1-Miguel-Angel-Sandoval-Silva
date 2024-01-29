package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDiez {

    String entrada;
    double metros,pulgadas;
    public  void Ejercicio10() throws IOException {
        System.out.print("Metros a pulgadas ");
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Cuantos metros de tela se encargara? ");
        entrada =  bufer.readLine();
        metros = Double.parseDouble(entrada);


        pulgadas = calculadoraMetrosPulgada(metros);
        System.out.println("Se tendra que pedir "+pulgadas+" pulgadas de tela");
    }
    public double calculadoraMetrosPulgada(double num1) {
        return num1*39.37;
    }
}
