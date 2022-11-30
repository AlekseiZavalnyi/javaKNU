package org.javapractices.HW9;
import java.util.Arrays;

public class Mobile {
    private Phone[] phones;
    private int n, k = 0;
    
    Mobile(){
        n = 1;
        phones = new Phone[1]; 
    }
    
    Mobile(int n){
        this.n = n;
        this.phones = new Phone[n];
    }
    
    public void showPhonesByCountry(String country){
        for (Phone p: phones){
            if (country.equals(p.getCountry()))
                System.out.print(p);
        }
    }
    
    public double getTotalPrice(){
        double sum = 0;
        for (Phone p: phones)
            sum += p.getPrice();
        return sum;
    }
    
    public void addPhone(String model, String country, double price){
        int n = phones.length;
        Phone new_p = new Phone(model, country, price);
        if (k == n-1){
            Phone[] tmp = Arrays.copyOf(phones, n);
            phones = new Phone[n + 1];
            System.arraycopy(tmp, 0, phones, 0, n);
            phones[n] = new_p;
        }
        if (k < n){
            phones[k] = new_p;
        }
        k++;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Phone p: phones)
            str += p;
        return str + "\n";
    }
            
    private class Phone {
        private String country, model;
        private double price;
        
        Phone(String model, String country, double price){
            this.model = model;
            this.country = country;
            this.price = price;
        }
        
        public String getCountry() { return country; }
        
        public String getModel() { return model; }
        
        public double getPrice() { return price; }
        
        @Override
        public String toString(){
            return "Phone " + model + "\ncountry: " + country + "\nprice: " + price + "\n" ;
        }
    }
}
