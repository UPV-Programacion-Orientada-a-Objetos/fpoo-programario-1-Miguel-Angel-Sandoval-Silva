package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioTres {

    String entrada;
    double b,h;
    public  void Ejercicio3() throws IOException {
        System.out.print("AREA DEL RECTANGULO");
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la medida de la base en centimetros: ");
        entrada =  bufer.readLine();
        b = Double.parseDouble(entrada);

        System.out.print("Ingrese la medida de la altura en centimetros: ");
        entrada =  bufer.readLine();
        h = Double.parseDouble(entrada);


        double areaRectangulo = area(b,h);
        System.out.println("El promedio del estudiante es: "+areaRectangulo);
    }
    public double area(double num1,double num2) {
        return num1*num2;
    }
}
