package org.javapractices.lab8.task6_1;

public class Flower implements Comparable<Flower> {
    private float price;
    private String color;
    private float length;
    private String date;

    public Flower() {}

    public Flower(float price, String color, float length, String date) {
        this.price = price;
        this.color = color;
        this.length = length;
        this.date = date;
    }
    
    public void setPrice(float price) { this.price = price; }
    
    public void setColor(String color) { this.color = color; }
    
    public void setLength(float length) { this.length = length; }
    
    public void setDate(String date) { this.date = date; }
    
    public float getPrice() { return price; }
    
    public String getColor() { return color; }
    
    public float getLength() { return length; }
    
    public String getDate() { return date; }

    @Override
    public int compareTo(Flower flower) {
        return this.getDate().compareTo(flower.getDate());
    }
}
