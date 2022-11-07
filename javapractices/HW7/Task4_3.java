
package org.javapractices.HW7;


public class Task4_3 {
        public static void main(String[] args){
        int n = 5, m = 4, k = 3;
        Polynom a = new Polynom(n);
        Polynom b = new Polynom(m);
        Polynom c = new Polynom(k);
        
        int min = 0, max = 10;

        
        for (int i = 0; i < n; i++){
            int r = (int) ((Math.random() * (max - min)) + min);
            int im = (int) ((Math.random() * (max - min)) + min);
            a.setCoeff(new ComplexNumber(r, im), i);
            if (i < m){
                r = (int) ((Math.random() * (max - min)) + min);
                im = (int) ((Math.random() * (max - min)) + min);
                b.setCoeff(new ComplexNumber(r, im), i);
            }
            if (i < k){
                r = (int) ((Math.random() * (max - min)) + min);
                im = (int) ((Math.random() * (max - min)) + min) + 1;
                c.setCoeff(new ComplexNumber(r, im), i);
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
