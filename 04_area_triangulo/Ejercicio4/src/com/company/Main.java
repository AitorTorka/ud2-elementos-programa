package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	/* Ejercicio 4 - Área de un triángulo

        Escribe un programa que, dada la base y la altura de un triángulo, calcule el área.

        Nota: El área es igual a la base por la altura entre dos.*/

        double base = 0;
        double altura = 0;
        double area = 0;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.print("Introduce Una Base: ");
        base = Double.parseDouble(br.readLine());

        System.out.print("Introduce Una Altura: ");
        altura = Double.parseDouble(br.readLine());

        area = (base * altura) / 2;

        System.out.print("El Area es: " +area);
    }
}