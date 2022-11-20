package org.javapractices.lab9.quadraticEq;

public class QuadraticEquation {
    private double x1, x2;
    private double a, b, c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setValues(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA() { return a; }

    public double getB() { return b; }

    public double getC() { return c; }

    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }

    public void setC(double c) { this.c = c; }

    public double discriminant() throws DiscriminantException {
        double d = b*b - 4*a*b;
        if (d < 0)
            throw new DiscriminantException("!", d);
        return d;
    }

    public void solve() throws  EqException {
        try {
            if (a == 0) throw new EqException("a is 0");

            double d = discriminant();
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);

        } catch (EqException e) {
            System.out.println(e.getMessage());
            throw new EqException("Division by 0");
        }
    }

    public void printRoots() {
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

}
