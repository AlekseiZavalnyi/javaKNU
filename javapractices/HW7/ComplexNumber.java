package org.javapractices.HW7;

class ComplexNumber {
    double real, image;
 
    public ComplexNumber(){
        this.real = 0.0;
        this.image = 0.0;
    }
    
    public ComplexNumber(double real, double image)
    {
        this.real = real;
        this.image = image;
    }
 
    @Override
    public String toString(){
        String num = "";
        if (image > 0)
            num += real + " + " + image + "*i";
        else
            num += real + " - " + Double.toString(Math.abs(image)) + "*i";
        return num;
    }
    
    public ComplexNumber negate(){
        return new ComplexNumber(-real, -image);
    }
 
    public ComplexNumber plus(ComplexNumber b) {
        ComplexNumber a = this;
        ComplexNumber res = new ComplexNumber();
        res.real = a.real + b.real;
        res.image = a.image + b.image;
        return res;
    }
    
    public ComplexNumber times(ComplexNumber b){
        ComplexNumber a = this;
        ComplexNumber res = new ComplexNumber();
        res.real = a.real * b.real + a.image * b.image;
        res.image = a.real * b.image + a.image * b.real;
        return res;
    }
}