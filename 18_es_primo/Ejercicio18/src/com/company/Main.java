package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Haz un programa que pida al usuario un número y diga si ese número es primo o no.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int numero;
        int i = 2;

        System.out.println("Introduce un numero: ");
        numero = Integer.parseInt(br.readLine());

        while (numero % i != 0 && i < numero) {
            i++;
        }
        if (i < numero) {
            System.out.println("El numero " + numero + " no es primo.");
        } else {
            System.out.println("El numero " + numero + " es primo.");
        }

    }

}