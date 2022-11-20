package org.javapractices.HW7;


public class Window {
    private String window = "I'm a window";
    int num;
    
    Window (int n){
        this.num = n;
        this.window += " number " + n;
    }
    
    @Override
    public String toString() { return window; }
}
