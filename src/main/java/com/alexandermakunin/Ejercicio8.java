package com.alexandermakunin;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] arrNum = new int[5];
        int[] arrNull = null;
        arrNum[0] = 1;
        arrNum[1] = 0;
        int num = 2;
        int value;
        int count = 0;
        boolean check = false;
        while (!check) {
            try {
                value = num / arrNum[count++];
                System.out.println(num + " / " + arrNum[count] + "=" + (num / value));
            } catch (ArithmeticException ae) {
                System.out.println("Error de division");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("array salido");
                check = true;
            }
        }
        try {
            arrNull.equals(arrNum);
            System.out.println("son iguales");
        } catch (NullPointerException e) {
            System.out.println("no son iguales");
        }
    }
}
