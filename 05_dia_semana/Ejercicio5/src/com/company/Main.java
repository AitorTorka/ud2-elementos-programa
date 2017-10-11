package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    /* Ejercicio 5 - Día de la semana

Introducir por teclado un número comprendido entre el 1 y el 7 e imprimir el día de la semana al que hace referencia.

Por ejemplo, si introducen el 1, se visualizará Lunes.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce numero de la semana:");
        int a = Integer.parseInt(br.readLine());

        switch (a) {

            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miercoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sabado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
        }

    }
}
