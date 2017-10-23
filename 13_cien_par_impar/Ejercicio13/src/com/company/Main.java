package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Elige par o impar: ");
        char c = br.readLine().toLowerCase().charAt(0);

        int a = -2;
        int b = -1;

        for (int n = 0; n <= 50; n++) {

            if (c == 'p') {
                a = a + 2;
                System.out.println(+a);
            } else {
                b = b + 2;
                System.out.println(+b);
            }
        }
    }
}
