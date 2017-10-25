package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /* Escribe un programa en el que pidamos al usuario un número y
         nos muestre los números primos entre 1 y ese número (incluido).*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int numero;
        int i = 2;

        System.out.println("Introduce un numero: ");
        numero = Integer.parseInt(br.readLine());

        for (int j = 1; j < i ; j++) {


            while (numero % i != 0 && i < numero) {
                i++;
            }
            if (i < numero) {
                System.out.println("El numero " + numero + " no es primo.");
            } else {
                System.out.println("El numero " + numero + " es primo.");
            }
            System.out.println("Los numeros son: " +j);
        }
    }
}