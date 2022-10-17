package org.javapractices.lab4;

public class Task4_1 {
    public static void main(String[] args) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = 277; // number of days since 01.01.2022
        int k = 145; // number of days since the last friday 13
        int max_k = 0;
        int m = 10;
        for (int y = 2022; y < 2423; y++){
            while (m <= 12){
                if (day % 7 == 0) {
                    if (k > max_k)
                        max_k = k;
                    k = 0;
                }
                day += days[m - 1];
                if (m == 2 && y % 4 == 0){
                    k += days[m - 1];
                    k++;
                    day++;
                } else
                    k += days[m - 1];
                m += 1;
            }
            m = 1;
        }
        System.out.printf("Max number of days without Friday 13: %d", max_k); // 427
    }
}