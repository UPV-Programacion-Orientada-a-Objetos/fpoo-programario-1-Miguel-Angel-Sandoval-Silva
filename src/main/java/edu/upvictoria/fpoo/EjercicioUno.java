package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EjercicioUno {
    String entrada;
    double numero1,numero2;
    public  void Ejercicio1() throws IOException {


        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el primer número: ");
        entrada =  bufer.readLine();
        numero1 = Double.parseDouble(entrada);
        System.out.print("Ingrese el segundo número: ");
        entrada =  bufer.readLine();
        numero2 = Double.parseDouble(entrada);
        double resultado = sumar(numero1,numero2);
        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+resultado);
    }
    public double sumar(double num1,double num2) {
        return num1 + num2;
    }
}
