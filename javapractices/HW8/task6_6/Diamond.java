package org.javapractices.HW8.task6_6;

public class Diamond extends Gemstone{
    private String color;
    private String place_of_origin;


    public Diamond(double weight, int rarity, int price, double transparency, String color, String place_of_origin) {
        super(weight, rarity, price, transparency);
        this.color = color;
        this.place_of_origin = place_of_origin;
    }
    
    public void setColor(String place_of_origin) { this.place_of_origin = place_of_origin; }
    
    public String getColor() { return color; }
    
    public void setPlaceOfOrigin(String place_of_origin) { this.place_of_origin = place_of_origin; }
    
    public String getPlaceOfOrigin() { return place_of_origin; }

    @Override
    public String toString() {
        return "Diamond" +
                "\ncolor: " + color +
                "\nplace of origin: " + place_of_origin +
                "\nweight: " + weight +
                "\nrarity: " + rarity +
                "\nprice: " + price +
                "\ntransparency: " + transparency + "\n";
    }
}
