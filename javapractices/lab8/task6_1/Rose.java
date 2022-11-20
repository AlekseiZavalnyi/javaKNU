package org.javapractices.lab8.task6_1;

class Rose extends Flower {
    public Rose() {
        super();
    }

    public Rose(float price, String color, float length, String date) {
        super(price, color, length, date);
    }

    @Override
    public String toString() {
        String str = "Rose color: " + super.getColor();
        str += "\nprice: " + super.getPrice();
        str += "\nlength: " + super.getLength();
        str += "\ndate: " + super.getDate() + "\n";
        return str;
    }
}
