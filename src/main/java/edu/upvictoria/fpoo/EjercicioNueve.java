package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioNueve {

    String entrada;
    double horas,sueldo,sueldoHora;
    public  void Ejercicio9() throws IOException {
        System.out.print("SUELDO SEMANAL DE UN TRABAJADOR");
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Cuantas horas trabajo esta semana? ");
        entrada =  bufer.readLine();
        horas = Double.parseDouble(entrada);

        System.out.print("¿Cuanto le pagan la hora? ");
        entrada =  bufer.readLine();
        sueldoHora = Double.parseDouble(entrada);


        sueldo = calculadoraSueldoHora(horas,sueldoHora);
        System.out.println("El trabajador gana "+sueldo+"$ a la semana");
    }
    public double calculadoraSueldoHora(double num1, double num2) {
        return num1*num2;
    }
}
