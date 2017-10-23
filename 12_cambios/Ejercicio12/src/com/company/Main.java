package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double cantidad = 0;
        double cambio = 0;
        double precio = 0;

        System.out.print("Introduce el precio: ");
        precio = Double.parseDouble(br.readLine());

        do {
            System.out.print("Introduce la cantidad: ");
            cantidad = Double.parseDouble(br.readLine());

            if (cantidad >= precio && cantidad % 5 == 0) {
                if (cantidad == precio) {
                    System.out.println("Correcto");
                } else {

                    cambio = (cantidad - precio)*100;
                   double monedas = (cambio/200);
                    System.out.print(" Monedas de 2 euros: " + monedas);



                }
            } else {
                System.out.println("Cantidad insuficiente o no multiplo de 5");
            }
        } while (cantidad % 5 != 0 && cantidad < precio);

    }
}
