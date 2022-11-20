package org.javapractices.HW7;

public class Door {
    private String door = "I'm a door";
    public String open = "closed"; 
    int num;
    
    Door (int n){
        this.num = n;
        this.door += " number " + n + ". And I'm ";
    }
    
    public String isOpen(){ return open; }
    
    public void OpenTheDoor() { open = "open"; }
    
    public void CloseTheDoor() { open = "closed"; }
    
    @Override
    public String toString() { return door + open; }
}
