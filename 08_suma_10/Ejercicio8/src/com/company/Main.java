package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Escribe un programa que pida un valor numérico y muestre su valor absoluto.

                El programa no terminará hasta que el usuario escriba el valor 0.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        int total = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Introduce un numero: ");
            numero = Integer.parseInt(br.readLine());
            total = total + numero;
        }
        System.out.println("El Total es : " + total);
    }

}
