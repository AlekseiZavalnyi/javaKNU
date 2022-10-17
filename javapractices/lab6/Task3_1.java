package org.javapractices.lab6;

public class Task3_1 {
    public static void main(String[] args){
        Rational[] list = new Rational[] {
                                new Rational(5, 6),
                                new Rational(-5, 6),
                                new Rational(-8, -4),
                                new Rational(0, 3),
                                new Rational(7, 16),
                                new Rational(9, -11)};
        
        System.out.printf("List: "); // 5/6  -5/6  2  0  7/16  -9/11
        for (Rational r: list)
            System.out.printf("%s  ", r.toString());
        
        int n = list.length;
        System.out.printf("\nNew list: "); //0  7/6  2  7/16  -67/176  1/66  
        Rational first = list[0];
        for (int i = 0; i < n; i++){
            Rational r = new Rational();
            if (i != n - 1)
                r = list[i].plus(list[i+1]); 
            else{
                r = list[i].plus(first);
            }
            //list[i] = r;
            System.out.printf("%s  ", r.toString());
        }
    }
}
