package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        // Acertar el numero.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int aleatorio = r.nextInt(100);

        System.out.println(+aleatorio);

        int intentos = 0;
        int conversion=0;
        String respuesta = "";

        do {
            System.out.print("Adivina el numero: ");
            respuesta = br.readLine();


            if (!respuesta.equals("FIN")) {

                conversion = Integer.parseInt(respuesta);

                if (conversion == aleatorio) {
                    System.out.println("Has acertado, el numero es: " + conversion + "\n" + "Tu numero de intentos ha sido de " + intentos);
                } else {
                    if (conversion < aleatorio) {
                        System.out.println("El numero que buscas es más alto");
                    } else {
                        System.out.println("El numero que buscas es más bajo");
                    }
                }
                intentos++;
            }
        } while (aleatorio != conversion && !respuesta.equals("FIN"));
        System.out.println("Fin del programa.");
    }
}
