package com.company;

public class Task5 {
    public static void main(String[] args) {
        int [] mas = new int[15];
        int [] mas1 = new int[15];
        int m = 0;
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random()*10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas1[i] = mas[i] + mas1[i] ;
                System.out.print(mas1[i] + " ");
            }

        }

    }
}
