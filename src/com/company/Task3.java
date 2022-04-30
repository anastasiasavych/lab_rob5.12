package com.company;

public class Task3 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        int[] mas3 = new int[5];
        double m1 = 0, m2 = 0, m3 = 0;
        for (int i = 0 ; i < 5; i++) {
            mas1[i] = (int) Math.round(Math.random() * 5);
            m1 = m1 + mas1[i];
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < 5; i++) {
            mas2[i] = (int) Math.round(Math.random() * 5);
            m2 = m2 + mas2[i];
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < 5; i++){
            mas3[i] = (int) Math.round(Math.random() * 5);
            m3 = m3 + mas3[i];
            System.out.print(mas3[i] + " ");
        }
        System.out.println();
        System.out.println(m1 /= 5);
        System.out.println(m2 /= 5);
        System.out.println(m3 /= 5);
        if (m1 < m2 )
            System.out.println("m1 < m2");
        if (m1 > m2)
            System.out.println("m1 > m2");
        if (m1 == m2)
            System.out.println("m1 == m2");
        if (m1 < m3)
            System.out.println("m1 < m3");
        if (m1 > m3)
            System.out.println("m1 > m3");
        if (m1 == m3)
            System.out.println("m1 == m3");
        if (m2 < m1)
            System.out.println("m2 < m1");
        if (m2 > m1)
            System.out.println("m2 > m1");
        if (m2 == m1)
            System.out.println("m2 == m1");
        if (m2 < m3)
            System.out.println("m2 < m3");
        if (m2 > m3)
            System.out.println("m2 > m3");
        if (m2 == m3)
            System.out.println("m2 == m3");
        if (m3 < m1)
            System.out.println("m3 < m1");
        if (m3 > m1)
            System.out.println("m3 > m1");
        if (m3 == m1)
            System.out.println("m3 == m1");
        if (m3 < m2)
            System.out.println("m3 < m2");
        if (m3 > m2)
            System.out.println("m3 > m2");
        if (m3 == m2)
            System.out.println("m3 == m2");
    }
}