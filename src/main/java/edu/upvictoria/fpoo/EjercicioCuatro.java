package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {
    String entrada;
    double radio;
    public  void Ejercicio4() throws IOException {
        System.out.print("AREA DE UNA CIRCUNFERENCIA");
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la medida del radio: ");
        entrada =  bufer.readLine();
        radio = Double.parseDouble(entrada);


        double areaCircunferencia = area(radio);
        System.out.println("El promedio del estudiante es: "+areaCircunferencia);
    }
    public  double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
