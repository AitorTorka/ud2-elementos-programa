package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce un valor: ");
        double a = Double.parseDouble(br.readLine());

        System.out.print("Introduce Fahrenheit (f) o Kelvin (k): ");
        char b = br.readLine().charAt(0);

        double f = a + 273.15;
        double k = (1.8 * a) + 32;

        if (b == 'f') {
            System.out.print("El valor en Fahrenheit es: " + f);

        } else {

            if ('k' == b) {
                System.out.print("El valor de Kelvin es: " + k);
            } else {
                System.out.print("Error");
            }
        }

    }
}
