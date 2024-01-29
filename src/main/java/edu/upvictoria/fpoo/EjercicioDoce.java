package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;

public class EjercicioDoce {

    String entrada;
    double area,b,h;
    public  void Ejercicio12() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Dame la medida de la base del triangulo ");
        entrada =  bufer.readLine();
        b = Double.parseDouble(entrada);
        System.out.print("Dame la medida de la altura del triangulo ");
        entrada =  bufer.readLine();
        h = Double.parseDouble(entrada);


        area = calculadoraAreaTriangulo(b,h);
        System.out.println("El area del triangulo es: "+area);
    }
    public double calculadoraAreaTriangulo(double num1, double num2) {
        return (num1 * num2)/2;
    }
}
