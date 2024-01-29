package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {
    String entrada;
    double a,b,c;
    public  void Ejercicio5() throws IOException {
        System.out.print("AREA DEL TERRENO");
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la medida en metros del A: ");
        entrada =  bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.print("Ingrese la medida en metros del B: ");
        entrada =  bufer.readLine();
        b = Double.parseDouble(entrada);

        System.out.print("Ingrese la medida en metros del C: ");
        entrada =  bufer.readLine();
        c = Double.parseDouble(entrada);
        EjercicioTres ejercicioTres = new EjercicioTres();
        double areaRectangulo = ejercicioTres.area(b,c);
        a=a-c;
        double areatriangulorectangulos = areaTrianguloRectangulo(a,b);
        System.out.println("El promedio del estudiante es: "+(areaRectangulo + areatriangulorectangulos));
    }
    public  double areaTrianguloRectangulo(double num1, double num2) {
        return (num1 * num2)/2;
    }
}
