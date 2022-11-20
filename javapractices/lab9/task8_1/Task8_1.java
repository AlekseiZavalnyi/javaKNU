package org.javapractices.lab9.task8_1;

public class Task8_1 {
    public static void main(String[] args){
        Payment p = new Payment(3);
        p.addProduct("Beer", 30.57);
        p.addProduct("Beer", 32.31);
        p.addProduct("Beer", 42.24);
        System.out.println(p);
        System.out.println("Total price: " + p.priceOfPayment());
    }
}
