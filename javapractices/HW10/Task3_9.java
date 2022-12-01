package org.javapractices.HW10;

public class Task3_9 {
    public static void main(String[] args){
        String str = "aa b a bbbbb abab c abdd cc";    
        int n = str.length();
        int[] count = new int[256];
        char minCh = '?', maxCh = '?';
        
        for (int i = 0; i < n; i++)
            count[str.charAt(i)]++;
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
 
        for (int i = 0; i < n; i++) {
            int a = count[str.charAt(i)];
            if (max < a){
                max = a;
                maxCh = str.charAt(i);
            } else if (min > a){
                min = a;
                minCh = str.charAt(i);
            }
        }
        
        System.out.println("Min Character: " + minCh + ". n = " + min);    // d. n = 2
        System.out.println("Max Character: " + maxCh + ". n = " + max);    // b. n = 9
    }
}
