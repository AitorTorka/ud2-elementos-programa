package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /* Ejercicio 17 - Sumar hasta leer FIN

        Haz un programa que pida al usuario valores numéricos hasta que el usuario escriba FIN.

        El programa irá sumando esos valores y cuando termine, mostrará la suma total, el máximo y
        el mínimo de los valores leídos.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int total = 0;
        String respuesta;

        do {

            System.out.println("Introduce un valor numérico: ");
            respuesta = br.readLine().toLowerCase();

            if (!respuesta.equalsIgnoreCase("fin")) {
                int v = Integer.parseInt(respuesta);
                total = total + v;

                if (v > maximo) {
                    maximo = v;
                }
                if (v < minimo) {
                    minimo = v;
                }
            }


        } while ( !respuesta.equalsIgnoreCase("fin"));

        System.out.println("El valor total es: " +total);
        System.out.println("El valor maximo es: " +maximo);
        System.out.println("El valor minimo es: " +minimo);

    }
}
