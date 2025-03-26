package com.alexandermakunin;

import java.util.Scanner;

public class Ejercicio4 {
    private static final Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arrNum = new int[5];
        leerNumeros(arrNum);
        int[] arrNull = null;
        leerNumeros(arrNull);
    }

    private static void leerNumeros(int[] arrNum) {
        try {
            if (arrNum != null || arrNum.length != 0) {
                int count = 0;
                boolean full = false;
                do {
                    try {
                        System.out.println("indique un numero");
                        arrNum[count] = Integer.parseInt(leer.nextLine());
                        count++;
                    } catch (NumberFormatException nfe) {
                        System.err.println("Indique un numero");
                    } catch (ArrayIndexOutOfBoundsException aioobe) {
                        System.err.println("El array esta lleno");
                        full = true;
                    }
                } while (!full);
            }
        } catch (NullPointerException npe) {
            System.err.println("Array vacio");
        }
    }
}
