package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCatorce {

    String entrada;
    int ano,edad;
    public  void Ejercicio14() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("¿En que año nacio? ");
        entrada =  bufer.readLine();
        ano = Integer.parseInt(entrada);


        edad = calculadoraEdad(ano);
        System.out.println("La persona tiene "+edad+" años de edad");
    }
    public int calculadoraEdad(int num1) {
        return 2024-num1;
    }
}
