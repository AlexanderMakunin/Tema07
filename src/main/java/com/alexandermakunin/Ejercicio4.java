package com.alexandermakunin;

import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrNum = new int[5];
        leerNumeros(arrNum);
    }
    private static void leerNumeros(int[] arrNum) {
        int count = 0;
        do {
            try {
                arrNum[count] = Integer.parseInt(leer.nextLine());
                count++;
            } catch (NumberFormatException nfe) {
                System.err.println("Indique un numero");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.err.println("El array esta lleno");
            }
        } while (count < arrNum.length);
    }
}
