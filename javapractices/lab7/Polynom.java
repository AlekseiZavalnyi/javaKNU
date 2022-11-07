
package org.javapractices.lab7;
import java.util.Arrays;

public class Polynom {
    private Rational[] coeff;
    
    Polynom(int n){
        coeff = new Rational[n];
        for (int i = 0; i < n; i++)
            coeff[i] = new Rational();
    }
    
    Polynom(Rational[] coeff){
        this.coeff = coeff;
    }
    
    public Rational[] getCoeff() { return coeff; }
    
    
    public boolean compareTo(Polynom y){       
        Rational[] coeffY = y.getCoeff();
        
        if (coeff.length != coeffY.length)
            return false;
        else{
            for (int i = 0; i < coeff.length; i++){
                if (coeff[i] != coeffY[i])
                    return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString(){
        String polynom = "";
        for(int i = coeff.length - 1; i > -1; i--){
            if (i > 0){
                if (coeff[i].compareTo(new Rational(0, 1)) && (i != coeff.length - 1))
                    polynom +=  "+ " + coeff[i].toString() + " * x^" + i + "  ";
                else
                    polynom +=  coeff[i].toString() + " * x^" + i + "  ";
            }
            else
                polynom += " + " + coeff[i].toString();
        }
        return polynom;
    }
    
    public void setCoeff(Rational r, int pow){
        coeff[pow] = r;
    }
    
    public void makeNegative(Polynom x){
        Rational[] coeffs = x.getCoeff();
        for(int i = 0; i < coeffs.length; i++)
            x.setCoeff(coeffs[coeffs.length - i].negate(), i);
    }
    
    public Polynom plus(Polynom y){
        Polynom x = this;
        Rational[] coeffsy = y.getCoeff();
        int lenx = x.getCoeff().length;
        int leny = coeffsy.length;
        if (lenx > leny){
            Polynom p = new Polynom(x.getCoeff());
            for (int i = 0; i < leny; i++)
                p.setCoeff(coeff[i].plus(coeffsy[i]), i);
            return p;
        }
        else if (lenx < leny){
            Polynom p = new Polynom(y.getCoeff());
            for (int i = 0; i < lenx; i++)
                p.setCoeff(coeff[i].plus(coeffsy[i]), i);
            return p;
        }
        else{
            Polynom p = new Polynom(x.getCoeff());
            for (int i = 0; i < lenx; i++)
                p.setCoeff(coeff[i].plus(coeffsy[i]), i);
            return p;
        }
    }
    
    public Polynom minus(Polynom y){
        Polynom x = this;
        makeNegative(x);
        return y.plus(x);
    }
        
    public Polynom mult(Polynom y){
        Polynom x = this;
        Rational[] coeffsy = y.getCoeff();
        int lenx = x.getCoeff().length;
        int leny = coeffsy.length;
        Polynom p = new Polynom(lenx + leny - 1);
        
        for (int i = 0; i < lenx; i++){
            for (int j = 0; j < leny; j++){
                p.setCoeff(coeff[i].times(coeffsy[j]), i+j);
            }
        }
        return p;
    }
        
}
