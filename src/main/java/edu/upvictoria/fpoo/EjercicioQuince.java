package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioQuince {

    String entrada;
    int min,horas,precio;
    public  void Ejercicio15() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿Cuantas horas se quedo? ");
        entrada =  bufer.readLine();
        horas = Integer.parseInt(entrada);
        System.out.print("A parte de las horas ¿Cuantos minutos se quedo? ");
        entrada =  bufer.readLine();
        min = Integer.parseInt(entrada);
        System.out.print("¿Cuantos cobran por hora? ");
        entrada =  bufer.readLine();
        precio = Integer.parseInt(entrada);
        if ((min < 60) && (min > 0)){
            horas++;
        }
        precio = calculadoraEstacionamiento(horas,precio);
        System.out.println("La persona tendra que pagar "+precio+"$");
    }
    public int calculadoraEstacionamiento(int num1, int num2) {
        return num1*num2;
    }
}
