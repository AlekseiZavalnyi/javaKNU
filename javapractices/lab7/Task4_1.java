package org.javapractices.lab7;

public class Task4_1 {
    public static void main(String[] args){
        int n = 5, m = 4, k = 3;
        Polynom a = new Polynom(n);
        Polynom b = new Polynom(m);
        Polynom c = new Polynom(k);
        
        int min = 0, max = 10;

        
        for (int i = 0; i < n; i++){
            int num = (int) ((Math.random() * (max - min)) + min);
            int den = (int) ((Math.random() * (max - min)) + min) + 1;
            a.setCoeff(new Rational(num, den), i);
            if (i < m){
                num = (int) ((Math.random() * (max - min)) + min);
                den = (int) ((Math.random() * (max - min)) + min) + 1;
                b.setCoeff(new Rational(num, den), i);
            }
            if (i < k){
                num = (int) ((Math.random() * (max - min)) + min);
                den = (int) ((Math.random() * (max - min)) + min) + 1;
                c.setCoeff(new Rational(num, den), i);
            }
        }
        
        Polynom[] p = new Polynom[] {a, b, c};
        Polynom sum = new Polynom(n);
        for (int i = 0; i < 3; i++){
            sum.plus(p[i]);
            System.out.printf("polynom %d: %s \n", i+1, p[i]);
        }
        
        System.out.printf("Sum of the polynoms: %s ", sum);
    }
}
