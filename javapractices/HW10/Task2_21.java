package org.javapractices.HW10;

public class Task2_21 {
    public static void main(String[] main){
        String str1 = "abababa";
        String str2 = "abaaba";
        String str3 = "ababab";
        int i = 2, j = 3;
        System.out.println(str1 + " n = " + i + ": " + checkN(str1, i)); // false
        System.out.println(str2 + " n = " + i + ": " + checkN(str2, i)); // true
        System.out.println(str2 + " n = " + j + ": " + checkN(str2, j)); // false
        System.out.println(str3 + " n = " + j + ": " + checkN(str3, j)); // true
    }
    
    // перевіряє чи складається рядок з n однакових підрядків
    public static boolean checkN(String str, int n){
        int a = 0, b = str.length() / n, step = str.length() / n;
        
        if (0 != str.length()%n) return false;
        
        for (int i = 0; i < n-1; i++){
            if (!str.substring(a, b).equals(str.substring(b, step+b))) return false;
            a = b;
            b += step;
        }
        return true;
    }
}
