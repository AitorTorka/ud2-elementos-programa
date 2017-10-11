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
        int numero2 = 0;
        int total = 0;


        System.out.print("Introduce la cantidad de valores que quieres sumar: ");
        numero2 = Integer.parseInt(br.readLine());

        if (numero2 < 0) {
            System.out.print("Error ");
        } else {
            for (int i = 0; i < numero2; i++) {

                System.out.print("Introduce un numero: ");
                numero = Integer.parseInt(br.readLine());

                total = total + numero;
            }
            System.out.println("El Total es : " + total);
        }

        /*do {
            System.out.print("Introduce un numero: ");
            numero = Integer.parseInt(br.readLine());

            if (recuento < numero2) {
                total= total + numero;
                recuento = recuento + 1;
            }
        }
        while ( recuento < numero2);
        System.out.println("El Total es : " +total);*/
    }

}

