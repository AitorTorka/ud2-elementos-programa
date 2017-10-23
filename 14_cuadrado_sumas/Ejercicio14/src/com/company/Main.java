package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /* Haz un programa que pida al usuario un valor y calcule el
        cuadrado de dicho valor, sin utilizar multiplicaciones.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = 0;

        System.out.println("Escribe un numero: ");

        int numero = Integer.parseInt(br.readLine());

        for (int i = 0; i < numero; i++) {
            t=t+numero;
        }
        System.out.println("El cuadrado del numero es : " + t);
    }
}
