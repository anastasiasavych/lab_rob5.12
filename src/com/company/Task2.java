package com.company;

public class Task2 {

    public static void main(String[] args) {
        int[] mas = new int[20];
        for (int a = 0; a < mas.length; a++) {
            mas[a] = (int) Math.round(Math.random() * 9);
            System.out.print(mas[a] + "  ");
        }
        System.out.println();
        for (int a = 0; a < mas.length; a++) {
            if (a % 2 == 0)
                mas[a] = 0;
            System.out.print( mas[a] + "  ");
        }


    }
}


