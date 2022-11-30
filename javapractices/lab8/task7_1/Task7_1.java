package org.javapractices.lab8.task7_1;

public class Task7_1 {
    public static void main(String[] args) {
        Dictionary d = new Dictionary("D", 10, "A, B", 10.10f, "German", "French", 100);
        Encyclopedia e = new Encyclopedia("E", 100, "A", 100.10f, 100);

        System.out.print(d);
        System.out.print(e);
    }
}
