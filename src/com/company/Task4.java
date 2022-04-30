package com.company;

public class Task4 {
    public static void main(String[] args) {
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        int[] mas3 = new int[10];
        for (int i = 0; i < 10; i++) {
            mas1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            mas2[i] = (int) Math.round(Math.random() * 10);
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            mas3[i] = mas1[i] + mas2[i];
            System.out.print(mas3[i] + " ");
        }
    }
}
