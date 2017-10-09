package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        /*Ejercicio 1 - Visualizar mensaje

        Escribe un programa que visualice por pantalla un mensaje introducido por teclado.*/

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        //Pantalla
        System.out.print("Introduce Un Mensaje: ");

        //Teclado
        String mensaje = br.readLine();

        //Pantalla
        System.out.println("Has introducido: " +mensaje);
    }
}
