package com.alexandermakunin;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        soliticarNumerosUsuario();
    }
    private static void soliticarNumerosUsuario() {
        System.out.println("indique numeros");
        double num = 0;
        StringBuilder sb = new StringBuilder();
        do {
            try {
                System.out.println("indique un numero");
                num = Double.parseDouble(leer.nextLine());
                if (num < 0) {
                    break;
                }
                sb.append(num).append(" ");
            } catch (NumberFormatException nfe) {
                System.err.println(nfe.getMessage());
            }
        } while (num >= 0);
        String[] arrString = sb.toString().split(" ");
        double[] arrNum = new double[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arrNum[i] = Double.parseDouble(arrString[i]);
        }
        System.out.println(Arrays.toString(arrNum));
    }
}
