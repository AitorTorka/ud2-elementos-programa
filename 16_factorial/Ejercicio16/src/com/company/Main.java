package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // Escribe un programa que calcule el factorial de un número leído por teclado.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un numero para calcular su factorial: ");
        int numero1 = Integer.parseInt(br.readLine());

        int t = 1;

        for (int i = 1; i <= numero1; i++) {
             t = t * i;
        }
        System.out.println("El factorial es : " + t);
    }
}
