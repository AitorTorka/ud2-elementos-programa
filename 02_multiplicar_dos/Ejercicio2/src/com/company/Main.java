package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Ejercicio 2 - Multiplicar dos

          Escribe un programa que muestre el resultado de multiplicar dos números introducidos por teclado.*/

        int a = 0;
        int b = 0;
        int c = 0;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Introduce Un Número: ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Introduce Otro Número: ");
        b = Integer.parseInt(br.readLine());

        c = a * b;

        System.out.println("El Resultado es: " + c);
    }
}