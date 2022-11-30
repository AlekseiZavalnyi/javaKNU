package org.javapractices.HW8.task7_15;

abstract class Notebook implements Paper{
    private String color, size, manufacturer;
    
    Notebook(){
        this.color = "white";
        this.size = "A4";
        this.manufacturer = "Undefined";
    }
    
    Notebook(String color, String size, String manufacturer){
        this.color = color;
        this.size = size;
        this.manufacturer = manufacturer;
    }
    
    @Override
    public String getColor() { return color; }
    
    @Override
    public String getSize() { return size; }
 
    @Override
    public String getManufacturer() { return manufacturer; }
    
    public void setColor(String color) { this.color = color; }
    
    public void setSize(String size) { this.size = size; }
 
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    
    @Override
    public String toString(){
        return "Notebook\nsize: " + size + "\ncolor: " + color + "\nmanufacturer: " + manufacturer; 
    }
    
}
