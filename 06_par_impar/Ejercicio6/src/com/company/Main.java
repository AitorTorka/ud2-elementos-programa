package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Ejercicio 6 - Par-impar

        Escribe un programa que pida un número al usuario y escriba en pantalla si el número es par o impar.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un numero:");
        int a = Integer.parseInt(br.readLine());

        if (a % 2 == 0) {
            System.out.print("El Numero es Par");
        } else {
            System.out.print("El Numero es Impar");
        }
    }
}
