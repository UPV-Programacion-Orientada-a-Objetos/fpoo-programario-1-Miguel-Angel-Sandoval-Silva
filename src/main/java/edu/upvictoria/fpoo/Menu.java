package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    int opc;
    String entrada;
    public  void Principal() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        do {
        System.out.println("MENU");
        System.out.println("Ingrese el numero del ejercicio que desea ver");
        System.out.println("1.- Suma de dos números");
        System.out.println("2.- Cálculo de promedios de exámen");
        System.out.println("3.- Área de un rectángulo");
        System.out.println("4.- Área de una circunferencia");
        System.out.println("5.- Área de un terreno con forma irregular");
        System.out.println("6.- Área de la figura con forma de cono de nieve");
        System.out.println("7.- Producción de leche");
        System.out.println("8.- Distancia entre dos puntos en el plano cartesiano");
        System.out.println("9.- Sueldo semanal de un trabajador");
        System.out.println("10.- Modista");
        System.out.println("11.- Conagua");
        System.out.println("12.- Área de un triángulo");
        System.out.println("13.- Conversiones de peso a dolar");
        System.out.println("14.- Edad del personal");
        System.out.println("15.- Estacionamiento");
        System.out.println("16.- Pinturas");
        System.out.println("17.- Hipotenusa");
        System.out.println("18.- Autobuses \"La curva loca\"");
        System.out.println("19.- Tiempo en bicicleta");
        System.out.println("20.- Costo de llamada telefónica");
        System.out.println("21.- CONAGUA");
        System.out.println("22.- Compañía de luz y sombras CLS");
        System.out.println("23.- Descuento e IVA");
        System.out.println("24.- Ahorro");
        System.out.println("25.- Cheques");
        System.out.println("26.- Concepto de monto");
        System.out.println("27.- Salir");
            System.out.println("");
        entrada =  bufer.readLine();
            System.out.println("");
        opc = Integer.parseInt(entrada);
            switch (opc){
                case 1:
                    EjercicioUno ejercicioUno = new EjercicioUno();
                    ejercicioUno.Ejercicio1();
                    break;
                case 2:
                    EjercicioDos ejercicioDos = new EjercicioDos();
                    ejercicioDos.Ejercicio2();
                    break;
                case 3:
                    EjercicioTres ejercicioTres = new EjercicioTres();
                    ejercicioTres.Ejercicio3();
                    break;
                case 4:
                    EjercicioCuatro ejercicioCuatro = new EjercicioCuatro();
                    ejercicioCuatro.Ejercicio4();
                    break;
                case 5:
                    EjercicioCinco ejercicioCinco = new EjercicioCinco();
                    ejercicioCinco.Ejercicio5();
                    break;
                case 6:
                   /* EjercicioSeis ejercicioSeis = new EjercicioSeis();
                    ejercicioSeis.Ejercicio6(); */
                    System.out.println("7");
                    break;
                case 7:
                    EjercicioSiete ejercicioSiete = new EjercicioSiete();
                    ejercicioSiete.Ejercicio7();
                    break;
                case 8:
                   /* EjercicioSeis ejercicioSeis = new EjercicioSeis();
                    ejercicioSeis.Ejercicio6(); */
                    System.out.println("8");
                    break;
                case 9:
                    EjercicioNueve ejercicioNueve = new EjercicioNueve();
                    ejercicioNueve.Ejercicio9();
                    break;
                case 10:
                    EjercicioDiez ejercicioDiez = new EjercicioDiez();
                    ejercicioDiez.Ejercicio10();
                    break;
                case 11:
                   /* EjercicioSeis ejercicioSeis = new EjercicioSeis();
                    ejercicioSeis.Ejercicio6(); */
                    System.out.println("11");
                    break;
                case 12:
                    EjercicioDoce ejercicioDoce = new EjercicioDoce();
                    ejercicioDoce.Ejercicio12();
                    break;
                case 13:
                    EjercicioTrece ejercicioTrece = new EjercicioTrece();
                    ejercicioTrece.Ejercicio13();
                    break;
                case 14:
                    EjercicioCatorce ejercicioCatorce = new EjercicioCatorce();
                    ejercicioCatorce.Ejercicio14();
                    break;
                case 27:
                    System.out.println("Vuelva pronto!!!");
                    break;
                default:
                    System.out.println("Ingrese un numero entre 1 y 27");
            }
        }while (opc!=27);


        // EjercicioUno uno = new EjercicioUno();
    }
}


