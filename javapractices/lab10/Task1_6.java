package org.javapractices.lab10;

public class Task1_6 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("AAAAAAA!!!");
        String str = "that we use to ilustrate the methods of class StringBuffer";

        sb.append(str);

        System.out.printf("New string: \n%s", sb);
    }
}
