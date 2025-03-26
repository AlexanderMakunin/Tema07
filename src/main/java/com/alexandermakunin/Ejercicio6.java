package com.alexandermakunin;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] arrNum = {-2, -1, 0, 1, 2};
        int num = 2;
        dividirEntreArrays(num, arrNum);
    }

    /*
    apartado a)
    public static void dividirEntreArrays(int num, int[] arrNum) {
        int value;
        for (int i : arrNum) {
            try {
                value = num / i;
                System.out.println(num + " / " + i + "=" + (num / value));
            } catch (ArithmeticException ae) {
                System.out.println("Error de division");
            }
        }
    }
     */
    public static void dividirEntreArrays(int num, int[] arrNum) {
        int value;
        for (int i : arrNum) {
            if (num == 0 || i == 0) {
                System.out.println("error aritmetica");
            } else {
                value = num / i;
                System.out.println(num + " / " + i + " = " + (num / value));
            }
        }
    }
}
