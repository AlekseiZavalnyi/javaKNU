package org.javapractices.lab9.task8_1;
import java.util.Arrays;

public class Payment {
    
    private Product[] products;
    private int k = 0;
    
    public Payment(int n) {
        this.products = new Product[n];
    }
    
    public Product[] getProducts() { return products; }
   
    public double priceOfPayment(){
        double sum = 0;
        for (Product p: products)
            sum += p.getPrice();
        return sum;
    }

    public void addProduct(String name,  double price){
        int n = products.length;
        Product new_p = new Product(name, price);
        if (k == n-1){
            Product[] tmp = Arrays.copyOf(products, n);
            products = new Product[n + 1];
            System.arraycopy(tmp, 0, products, 0, n);
            products[n] = new_p;
        }
        if (k < n){
            products[k] = new_p;
        }
        k++;
    }
        
    @Override
    public String toString(){
        String str = "";
        for (Product p: products)
            str += p;
        return str;
    }
    
    class Product{        
        private String name;
        private double price;
        
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public double getPrice() { return price; }
        
        public void setPrice(double price) { this.price = price; }

        @Override
        public String toString() {return "product " + name + ", price: " + price + "\n";}
    }
}
