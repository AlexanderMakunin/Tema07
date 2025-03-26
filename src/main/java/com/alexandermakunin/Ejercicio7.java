package com.alexandermakunin;

public class Ejercicio7 {
    public static void main(String[] args) {
        char[] arrChar = new char[3];
        arrChar[0] = 'a';
        arrChar[2] = 'c';
        mostrarCadenasArray(arrChar);
    }

    private static void mostrarCadenasArray(char[] arrChar) {
        for (char car : arrChar) {
            try {
                System.out.println(car);
            }catch (NullPointerException npe) {
                System.out.println("caracter nulo");
            }
        }

    }
}
