package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Ejercicio 3 - Orden inverso

        Escribe un programa que permita introducir a través del teclado tres números e imprimirlos en orden inverso a su lectura.*/

        int a = 0;
        int b = 0;
        int c = 0;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Introduce Un Número: ");
        a = Integer.parseInt(br.readLine());

        System.out.print("Introduce Otro Número: ");
        b = Integer.parseInt(br.readLine());

        System.out.print("Introduce Otro Número: ");
        c = Integer.parseInt(br.readLine());

        System.out.println("El Resultado es: " + c);
        System.out.println("El Resultado es: " + b);
        System.out.println("El Resultado es: " + a);
    }
}