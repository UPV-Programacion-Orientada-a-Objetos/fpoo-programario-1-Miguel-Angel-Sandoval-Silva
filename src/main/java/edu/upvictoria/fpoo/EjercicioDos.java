package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioDos {
    String entrada;
    double cal1,cal2,cal3,cal4;
    public  void Ejercicio2() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la calificacion del 1 examen: ");
        entrada =  bufer.readLine();
        cal1 = Double.parseDouble(entrada);

        System.out.print("Ingrese la calificacion del 2 examen: ");
        entrada =  bufer.readLine();
        cal2 = Double.parseDouble(entrada);

        System.out.print("Ingrese la calificacion del 3 examen: ");
        entrada =  bufer.readLine();
        cal3 = Double.parseDouble(entrada);

        System.out.print("Ingrese la calificacion del 4 examen: ");
        entrada =  bufer.readLine();
        cal4 = Double.parseDouble(entrada);
        double promedioFinal = dividir(cal1,cal2,cal3,cal4);
        System.out.println("El promedio del estudiante es: "+promedioFinal);
    }
    public double dividir(double num1,double num2,double num3,double num4) {
        return (num1 + num2 + num3 + num4)/4;
    }
}
