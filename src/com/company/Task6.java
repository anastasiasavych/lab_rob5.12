package com.company;

public class Task6 {
    public static void main(String[] args) {
        int [][] mas =  new int[15][];
        mas[0] = new int [5];
        mas[1] = new int [5];
        mas[2] = new int [5];
        mas[3] = new int [5];

        mas[4] = new int [8];
        mas[5] = new int [8];
        mas[6] = new int [8];
        mas[7] = new int [8];

        mas[8] = new int [3];
        mas[9] = new int [3];
        mas[10] = new int [3];
        mas[11] = new int [3];

        mas[12] = new int [9];
        mas[13] = new int [9];
        mas[14] = new int [9];

        for(int i = 0; i < mas.length; i++){
            for(int j=0; j < mas[i].length; j++){
                mas[i][j]=(int)(Math.random()*15);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");

        }
    }
}

