package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        /* Haz un programa que pida un DNI y una letra y compruebe que la letra introducida sea la correcta para ese DNI.

        Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección
        mediante la siguiente tabla:

RESTO	0	1	2	3	4	5	6	7	8	9	10	11
LETRA	T	R	W	A	G	M	Y	F	P	D	X	B


RESTO	12	13	14	15	16	17	18	19	20	21	22
LETRA	N	J	Z	S	Q	V	H	L	C	K	E
*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        char letra = ' ';


        System.out.print("Introduce el numero del DNI: ");
        numero = Integer.parseInt(br.readLine());

        System.out.print("Introduce la letra del DNI: ");
        letra = br.readLine().toLowerCase().charAt(0);

        int resto = numero/23;

        switch (resto) {
            case '0':
                letra = 't';
                break;

            switch (resto) {
                case '1':
                    letra = 't';
                    break;
                switch (resto) {
                    case '2':
                        letra = 't';
                        break;
                    switch (resto) {
                        case '3':
                            letra = 't';
                            break;
                        switch (resto) {
                            case '4':
                                letra = 't';
                                break;
                            switch (resto) {
                                case '5':
                                    letra = 't';
                                    break;
                                switch (resto) {
                                    case '6':
                                        letra = 't';
                                        break;
                                    switch (resto) {
                                        case '7':
                                            letra = 't';
                                            break;
                                        switch (resto) {
                                            case '8':
                                                letra = 't';
                                                break;
                                            switch (resto) {
                                                case '9':
                                                    letra = 't';
                                                    break;
        }
    }
}
