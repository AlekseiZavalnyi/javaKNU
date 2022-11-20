package org.javapractices.lab7;

public class Rational {
    private int num, den;
    
    Rational(){
        num = 0;
        den = 1;
    }
    
    Rational(int n, int d){
        if (d == 0)
            System.out.print("Denominator cant be zero");
        else{
            int g = gcd(n, d);
            num = n / g;
            den = d / g;
            if (den < 0){
                num = -num;
                den = -den;
            }
        }
    }
    
    private static int gcd(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (0 == n) return m;
        else return gcd(n, m % n);
    }
    
    public int numerator() { return num; }
    
    public int denominator() { return den; }
    
    public boolean compareTo(Rational b){ // returns true if a > b
        Rational a = this;
        int lhs = a.num * b.den;
        int rhs = a.den * b.num;
        if (lhs > rhs) 
            return true;
        return false;
    }
    
    @Override
    public String toString() {
        if (den == 1) 
            return Integer.toString(num);
        else          
            return num + "/" + den;
    }
    
    // return a == b
    public boolean equals(Rational b){
        return (compareTo(b) && compareTo(this)) == false; 
    }
    
    // return a + b
    public Rational plus(Rational b) {
        Rational a = this;
        Rational p = new Rational(a.num * b.den + b.num * a.den, b.den * a.den);
        return p;
    }
    
    public Rational negate() {
        return new Rational(-num, den);
    }
    
    // return a - b
    public Rational minus(Rational b) {
        Rational a = this;
        return a.plus(b.negate());
    }
    
    // return a * b
    public Rational times(Rational b) {
        Rational a = this;
        Rational c = new Rational(a.num, b.den);
        Rational d = new Rational(b.num, a.den);
        return new Rational(c.num * d.num, c.den * d.den);
    }

    // return a / b
    public Rational divides(Rational b) {
        Rational a = this;
        return a.times(new Rational(b.den, b.num));
    }
}
