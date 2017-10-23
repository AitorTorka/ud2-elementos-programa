package com.company;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /*Pedir dos números al usuario.

                Visualizar un menú como el siguiente y cuando el usuario elija una opción mostrar
                un mensaje con el resultado de hacer la operación con los dos números leídos.

                Si la opción elegida es incorrecta, lo indicaremos y volveremos a mostrar el menú.

                MENÚ
                ----
                a) Suma.
                b) Resta.
                c) Multiplicación.
                d) División.
                e) Resto.
                f) Terminar.

                Introduzca una opción:
        Nota: El programa no terminará hasta elegir la opción f.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero1 = 0;
        int numero2 = 0;
        char opcion = ' ';

        System.out.print("Introduce un numero: ");
        numero1 = Integer.parseInt(br.readLine());

        System.out.print("Introduce un otro numero: ");
        numero2 = Integer.parseInt(br.readLine());

        System.out.println(
                "MENÚ\n" +
                "----\n" +
                "a) Suma.\n" +
                "b) Resta.\n" +
                "c) Multiplicación.\n" +
                "d) División.\n" +
                "e) Resto.\n" +
                "f) Terminar.\n " +
                        "Elija la opcion deseada: ") ;

         opcion = br.readLine().toLowerCase().charAt(0);


        switch (opcion) {

            case 'a':
               int a = numero1 + numero2;
                System.out.print("La Suma es: " +a);
                break;
            case 'b':
                int b = numero1 - numero2;
                System.out.print("La Resta es: " +b);
                break;
            case 'c':
                int c = numero1 * numero2;
                System.out.print("La Multiplicación es: " +c);
                break;
            case 'd':
                int d = numero1 / numero2;
                System.out.print("La División es: " +d);
                break;
            case 'e':
                int e = numero1 % numero2;
                System.out.print("El Resto es: " +e);
                break;
            case 'f':
                System.out.print("Fin del programa");
                break;


        }
    }
}
