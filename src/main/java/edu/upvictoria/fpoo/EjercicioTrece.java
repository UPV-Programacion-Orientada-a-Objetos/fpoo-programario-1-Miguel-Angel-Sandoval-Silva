package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTrece {

    String entrada;
    double peso,dolar;
    public  void Ejercicio13() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Cuantos pesos mexicanos quiere cambiar a dolar? ");
        entrada =  bufer.readLine();
        peso = Double.parseDouble(entrada);


        dolar = calculadoraPesoADolar(peso);
        System.out.println("Serian "+dolar+" dolares");
    }
    public double calculadoraPesoADolar(double num1) {
        return num1 * 17.17;
    }
}
