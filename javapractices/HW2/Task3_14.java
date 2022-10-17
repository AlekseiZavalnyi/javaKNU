package org.javapractices.HW2;
import java.util.Scanner;

public class Task3_14 {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      long a = 0, b = 0;
      int k = 10;
      for (int i = 0; i < 20; i++){
          int x = in.nextInt();
          if (i < 10)
              a += x*Math.pow(10, k-1);
          else if (i == 10)
              k = 10;
          else if (i >= 10) 
              b += x*Math.pow(10, k-1);
          k -= 1;
      }
      
      System.out.printf("%d + %d = %d", a, b, a+b);
    }
}