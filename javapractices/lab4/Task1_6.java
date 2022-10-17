package org.javapractices.lab4;

public class Task1_6 {
    public static void main(String args[]) {
        int[] nums = new int[] {4546, 54684, 5462, 1506, 64, 150, 871, 489432, 88, 56};
        double min = Double.POSITIVE_INFINITY;
        
        for (int num : nums){
            int d = lengthOfTheNumber(num);
            if (d < min){
                min = d;
            }
        }
        
        System.out.printf("Min length is %d\nNumbers: ",(int) min);
        for (int num : nums){
            if (lengthOfTheNumber(num) == min)
                System.out.printf("%d ", num);
        }
    }
    
    public static int lengthOfTheNumber(int x){
        int count = 0;
        while (x != 0){
            x /= 10;
            count += 1;
        }
        return count;
    }
}