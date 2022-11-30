package org.javapractices.lab8.task6_1;

public class Task6_1 {
    public static void main(String[] args){
        Flower[] flowers = {new Rose(1, "red", 1/2, "19.11.2022"),
                new Rose(2, "blue", 2/3, "20.11.2022"),
                new Lily(1, "white", 1, "17.11.2022")};

        Bouquet bouquet = new Bouquet(flowers);
        bouquet.addFlower(new Lily(2, "purple", 5/6, "18.11.2022"));
        bouquet.sortFlowers();

        System.out.println("Bouquet sorted by condition:\n" + bouquet);
        System.out.printf("Flowers with length %.2f - %.2f:\n %s\n", (float) 1/2, (float) 7/8, bouquet.findByLength(1/2, 7/8));
    }
}
