package org.javapractices.lab8.task6_1;
import java.util.Arrays;


public class Bouquet {
    public Flower[] flowers;

    Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public void addFlower(Flower f) {
        int n = this.flowers.length;
        Flower[] tmp = Arrays.copyOf(this.flowers, n);
        this.flowers = new Flower[n + 1];
        System.arraycopy(tmp, 0, flowers, 0, n);
        flowers[n] = f;
    }

    public void sortFlowers() {
        Arrays.sort(flowers);
    }

    public String findByLength(float a, float b) {
        String s = "";
        for (Flower f: flowers){
            if (a <= f.getLength() && f.getLength() <= b) s += f;
        }
        return s;
    }

    public double getPrice(){
        double price = 0;
        for (Flower flower: flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    @Override
    public String toString(){
        String str = "Bouquet: \n";
        for (Flower f: flowers){
            str += f.toString();
        }
        return str + "\n";
    }
}
