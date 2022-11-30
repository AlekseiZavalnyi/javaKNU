package org.javapractices.lab8.task6_1;

class Lily extends Flower{
    public Lily() {
        super();
    }

    public Lily(float price, String color, float length, String date) {
        super(price, color, length, date);
    }

    @Override
    public String toString() {
        String str = "Lily color: " + super.getColor();
        str += "\nprice: " + super.getPrice();
        str += "\nlength: " + super.getLength();
        str += "\ndate: " + super.getDate() + "\n";
        return str;
    }
}
