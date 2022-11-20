package org.javapractices.HW8.task6_6;


public class Ruby extends Gemstone{
    private String place_of_origin;

    public Ruby(double weight, int rarity, int price, double transparency, String place_of_origin) {
        super(weight, rarity, price, transparency);
        this.place_of_origin = place_of_origin;
    }

    public void setPlaceOfOrigin(String place_of_origin) { this.place_of_origin = place_of_origin; }
    
    public String getPlaceOfOrigin() { return place_of_origin; }
    
    @Override
    public String toString() {
        return "Ruby" +
                "\nplace of origin: " + place_of_origin +
                "\nweight: " + weight +
                "\nrarity: " + rarity +
                "\nprice: " + price +
                "\ntransparency: " + transparency + "\n";
    }
}
