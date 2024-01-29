package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {
    String entrada;
    double precio,litros,galon;
    public  void Ejercicio7() throws IOException {
        System.out.print("Produccion de leche");
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Cuantos litros de leche produce al dia? ");
        entrada =  bufer.readLine();
        litros = Double.parseDouble(entrada);

        System.out.print("¿Cual es el precio del galon? ");
        entrada =  bufer.readLine();
        precio = Double.parseDouble(entrada);


        galon = calculadoraLitrosAGalon(litros);
        precio=precioGalon(precio,galon);
        System.out.println("El dia de hoy se producieron "+galon+ "galones de leche");
        System.out.println("Si se vende toda la produccion se obtendria de ganansias "+precio+"$");
    }
    public double calculadoraLitrosAGalon(double num1) {
        return num1/3.785;
    }

    public double precioGalon(double num1, double num2) {
        return num1*num2;
    }
}
