package com.alexandermakunin;

import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
    soliticarNumerosUsuario();
    }
    private static void soliticarNumerosUsuario() {
        System.out.println("indique numeros");
        double num = 0;
        boolean salir = false;
        StringBuilder sb = new StringBuilder();
        do {
            try {
                System.out.println("indique un numero");
                num = Double.parseDouble(leer.nextLine());
                sb.append(num).append(" ");
            } catch (NumberFormatException e) {
                if (e.getMessage().equals("empty String")) {
                    System.err.println("ponga algo");
                } else {
                    System.err.println(e.getMessage());
                    salir = true;
                }
            }
        } while (!salir);
        String[] arrString = sb.toString().split(" ");
        double[] arrNum = new double[arrString.length];
        double maxNum = arrNum[0];
        if (arrNum.length != 1) {
            for (int i = 0; i < arrString.length; i++) {
                arrNum[i] = Double.parseDouble(arrString[i]);
                if (maxNum < arrNum[i]) {
                    maxNum = arrNum[i];
                }
            }
        }
        System.out.println(maxNum);
    }
}
