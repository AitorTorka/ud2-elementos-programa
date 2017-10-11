package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Escribe un programa que pida un valor numérico y muestre su valor absoluto.

                El programa no terminará hasta que el usuario escriba el valor 0.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;

        do {
            System.out.print("Introduce un numero: ");
            a = Integer.parseInt(br.readLine());

            if (a == 0) {
                System.out.print("Programa Finalizado");
            } else {


                if (a > 0) {
                    System.out.println("El valor absoluto es: " + a);
                } else {
                    a = a * (-1);
                    System.out.println("El Valor absoluto es: " + a);
                }
            }
        }
        while (a != 0);

    }

}
