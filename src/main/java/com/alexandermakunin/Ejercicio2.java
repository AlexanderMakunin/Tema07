package com.alexandermakunin;

import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        solicitarNumeros();
    }
    private static void solicitarNumeros() {
        System.out.println("indique numeros 10 numeros");
        double num = 0;
        double maxNum;
        int countError = 0;
        StringBuilder sb = new StringBuilder();
        do {
            try {
                System.out.println("indique un numero");
                num = Double.parseDouble(leer.nextLine());
                sb.append(num + " ");
            } catch (NumberFormatException nfe) {
                countError++;
                System.err.println(nfe.getMessage());
            }
        } while (sb.toString().split(" ").length < 10);
        String[] arrString = sb.toString().split(" ");
        double[] arrNum = new double[arrString.length];
        maxNum = arrNum[0];
        for (int i = 0; i < arrString.length; i++) {
            arrNum[i] = Double.parseDouble(arrString[i]);
            if (maxNum < arrNum[i]) {
                maxNum = arrNum[i];
            }
        }
        System.out.println(maxNum);
        System.err.println("Cantidad de errores: " + countError);
    }
}
