package org.javapractices.project;

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class Test_tensor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Тестування з файлу/консолі (1/2) ");
        int flag = in.nextInt();
        if (flag == 1){
            case1();
        } else if (flag == 2){
            case2();
        }
    }
    
    public static void case1(){
        Scanner in = new Scanner(System.in);
        String command;
        Tensor<Integer> t1 = null;
        Tensor<Integer> t2 = null;
        boolean f_t1 = false, f_t2 = false;
        do {
            System.out.println("Введіть команду ");
            command = in.nextLine();
            if (command.equals("new tensor")){
                boolean flag;
                boolean h = true;
                boolean both;
                int f = 1;
                do{
                    flag = false;
                    both = false;
                    if (h){
                        System.out.println("Бажаєте ввести t1 чи t2? (1/2) ");
                        f = in.nextInt();
                    }
                    
                    System.out.println("Введіть кількість розмірностей тензору: ");
                    int size = in.nextInt();
                    System.out.println("Введіть розмірності");
                    int[] shape = new int[size];
                    for (int i = 0; i < size; i++){
                        int s = in.nextInt();
                        shape[i] = s;
                    }

                    int p = 1;
                    for (int el: shape){
                        p *= el;
                    }
                    System.out.println("Введіть " + p + " значень тензору (цілі числа)");
                    Integer[] values = new Integer[p];
                    for (int i = 0; i < p; i++){
                        Integer s = in.nextInt();
                        values[i] = s;
                    }
                    try{
                        if (f == 1){
                            t1 = new Tensor<> (Integer.class, shape, values);
                            f_t1 = true;
                        } else if (f == 2){
                            t2 = new Tensor<> (Integer.class, shape, values);
                            f_t2 = true;
                        }
                    } catch (InvalidShapeException e){
                        System.out.print("Спробуйте ввести тензор заново");
                        flag = true;
                    } catch (DataSizeException e){
                        System.out.print("Спробуйте ввести тензор заново");
                        flag = true;
                    }
                    if (!flag){
                        System.out.println("Введений тензор: ");
                        if (f == 1){
                            System.out.println(t1);
                        } else if (f == 2){
                            System.out.println(t2);
                        }
                    }

                } while(flag);
            
            } else if (command.equals("negate")){
                System.out.println("t1 чи t2? (1/2) ");
                int f = in.nextInt();
                if (f == 1 && f_t1){
                    System.out.println(t1.negate());
                } else if (f == 2 && f_t2){
                    System.out.println(t2.negate());
                } else{
                    System.out.println("Щось трапилось :(");
                }
            } else if (command.equals("add")){
                if (f_t1 && f_t2){
                    System.out.println(t1.add(t2));
                } else {
                    System.out.println("Не вистачає тензорів :(");
                }
            } else if (command.equals("mm")){
                System.out.println("t1*t2 чи t2*t1? (1/2) ");
                int f = in.nextInt();
                if (f_t1 && f_t2){
                    if (f == 1){
                        System.out.println(t1.mm(t2));
                    } else if (f == 2){
                        System.out.println(t2.mm(t1));
                    } else{
                        System.out.println("Щось трапилось :(");
                    }
                } else {
                    System.out.println("Не вистачає тензорів :(");
                }
            }  else if (command.equals("minus")){
                System.out.println("t1-t2 чи t2-t1? (1/2) ");
                int f = in.nextInt();
                if (f_t1 && f_t2){
                    if (f == 1){
                        System.out.println(t1.minus(t2));
                    } else if (f == 2){
                        System.out.println(t2.minus(t1));
                    } else{
                        System.out.println("Щось трапилось :(");
                    }
                } else {
                    System.out.println("Не вистачає тензорів :(");
                }
            } else if (command.equals("matmult")){
                System.out.println("t1*t2 чи t2*t1? (1/2) ");
                int f = in.nextInt();
                if (f_t1 && f_t2){
                    if (f == 1){
                        System.out.println(t1.matmult(t2));
                    } else if (f == 2){
                        System.out.println(t2.matmult(t1));
                    } else{
                        System.out.println("Щось трапилось :(");
                    }
                } else {
                    System.out.println("Не вистачає тензорів :(");
                }
            } else if (command.equals("set item")){
                System.out.println("t1 чи t2? (1/2)");
                int f = in.nextInt();
                if (f == 1 && f_t1){
                    System.out.println("Введіть" + t1.getShape().length + " розмірностей тензору: ");
                    int[] sh = new int[t1.getShape().length];
                    for (int i = 0; i < t1.getShape().length; i++){
                        int s = in.nextInt();
                        sh[i] = s;
                    }
                    System.out.println("Введіть новий елемент ");
                    Integer el = in.nextInt();
                    t1.setItem(sh, el);
                } else if (f == 2 && f_t2){
                    System.out.println("Введіть" + t2.getShape().length + " розмірностей тензору: ");
                    int[] sh = new int[t2.getShape().length];
                    for (int i = 0; i < t2.getShape().length; i++){
                        int s = in.nextInt();
                        sh[i] = s;
                    }
                    System.out.println("Введіть новий елемент ");
                    Integer el = in.nextInt();
                    t2.setItem(sh, el);
                } else {
                    System.out.println("Не існує тензору " + f + " :(");
                }
            } else if (command.equals("get item")){
                System.out.println("t1 чи t2? (1/2)");
                int f = in.nextInt();
                if (f == 1 && f_t1){
                    System.out.println("Введіть" + t1.getShape().length + " розмірностей тензору: ");
                    int[] sh = new int[t1.getShape().length];
                    for (int i = 0; i < t1.getShape().length; i++){
                        int s = in.nextInt();
                        sh[i] = s;
                    }
                    System.out.println("Елемент під індексом " + Arrays.toString(sh));
                    System.out.println(t1.getItem(sh));
                } else if (f == 2 && f_t2){
                    System.out.println("Введіть" + t2.getShape().length + " розмірностей тензору: ");
                    int[] sh = new int[t2.getShape().length];
                    for (int i = 0; i < t2.getShape().length; i++){
                        int s = in.nextInt();
                        sh[i] = s;
                    }
                    System.out.println("Елемент під індексом " + Arrays.toString(sh));
                    System.out.println(t2.getItem(sh));
                } else {
                    System.out.println("Не існує тензору " + f + " :(");
                }
            } else if (command.equals("const")){
                System.out.println("t1 чи t2? (1/2)");
                int f = in.nextInt();
                if (f == 1 && f_t1){
                    System.out.println("Введіть ціле число: ");
                    Integer s = in.nextInt();
                    System.out.println(t1.multByConstant(s));
                } else if (f == 2 && f_t2){
                    System.out.println("Введіть ціле число: ");
                    Integer s = in.nextInt();
                    System.out.println(t2.multByConstant(s));
                } else {
                    System.out.println("Не існує тензору " + f + " :(");
                }                
            } else if (command.equals("write")){
                System.out.println("t1 чи t2? (1/2)");
                int f = in.nextInt();
                if (f == 1 && f_t1){
                    t1.writeJson();
                    System.out.println("Тензор записано до файлу!");
                } else if (f == 2 && f_t2){
                    t2.writeJson();
                    System.out.println("Тензор записано до файлу!");
                } else {
                    System.out.println("Не існує тензору " + f + " :(");
                }       
            } else if (command.equals("read")){
                System.out.println("t1 чи t2? (1/2)");
                int f = in.nextInt();
                if (f == 1 && f_t1){
                    t1.readJson();
                    System.out.println("Тензор зчитано з файлу!");
                } else if (f == 2 && f_t2){
                    t2.readJson();
                    System.out.println("Тензор зчитано з файлу!");
                } else {
                    System.out.println("Не існує тензору " + f + " :(");
                }       
            } /*else {
                System.out.println("Не розумію команду :(");
            }*/
        } while (!command.equals("exit"));
    }
    
    public static void case2(){
        try {
            String path = "C:\\Users\\Админ\\Documents\\NetBeansProjects\\KR2\\src\\main\\java\\org\\javapractices\\project\\for_test.txt";
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            boolean first = true;
            Tensor<Integer> t1 = null;
            Tensor<Integer> t2 = null;
            
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if(!line.startsWith("#")){
                    if (line.equals("NEWTENSOR")){
                        int size = Integer.parseInt(myReader.nextLine());
                        int[] shape = new int[size];
                        String[] values = myReader.nextLine().split(" ");
                        int i = 0;
                        for (String v: values){
                            shape[i] = Integer.parseInt(v);
                            i++;
                        }
                        values = myReader.nextLine().split(" ");

                        Integer[] data = new Integer[values.length];
                        i = 0;
                        for (String v: values){
                            data[i] = Integer.parseInt(v);
                            i++;
                        }
                        
                        //System.out.println(Arrays.toString(data));
                        //System.out.println(Arrays.toString(shape));
                        if (first){
                            t1 = new Tensor<> (Integer.class, shape, data);
                            first = false;
                        } else{
                            t2 = new Tensor<> (Integer.class, shape, data);
                            first = true;
                        }
                    } else if (line.equals("PRINT")){
                        System.out.print("PRINT\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1);
                        } else{
                            System.out.println(t2);
                        }
                    } else if (line.equals("ADD")){
                        System.out.print("ADD\n");
                        System.out.println(t1.add(t2));
                    } else if (line.equals("MINUS")){
                        System.out.print("MINUS\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1.minus(t2));
                        } else{
                            System.out.println(t2.minus(t1));
                        }
                    } else if (line.equals("KRONECKER")){
                        System.out.print("KRONECKER\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1.kroneckerProd(t2));
                        } else{
                            System.out.println(t2.kroneckerProd(t1));
                        }
                    } else if (line.equals("NEGATE")){
                        System.out.print("NEGATE\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1.negate());
                        } else{
                            System.out.println(t2.negate());
                        }
                    } else if (line.equals("MM")){
                        System.out.print("MM\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1.mm(t2));
                        } else{
                            System.out.println(t2.mm(t1));
                        }
                    } else if (line.equals("MATMULT")){
                        System.out.print("MATMULT\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1.matmult(t2));
                        } else{
                            System.out.println(t2.matmult(t1));
                        }
                    } else if (line.equals("GETITEM")){
                        System.out.print("GETITEM\n");
                        boolean flag = true;
                        if (!myReader.nextLine().equals("1")){
                            flag = false;
                        }
                        
                        String[] values = myReader.nextLine().split(" ");
                        int[] shape = new int[values.length];
                        int i = 0;
                        for (String v: values){
                            shape[i] = Integer.parseInt(v);
                            i++;
                        }
                        
                        if (flag){
                            System.out.println("Indexes " + Arrays.toString(shape) + ": " + t1.getItem(shape));
                        } else{
                            System.out.println("Indexes " + Arrays.toString(shape) + ": " + t2.getItem(shape));
                        }
                        
                    } else if (line.equals("SETITEM")){
                        System.out.print("SETITEM\n");
                        boolean flag = true;
                        if (!myReader.nextLine().equals("1")){
                            flag = false;
                        }
                        
                        String[] values = myReader.nextLine().split(" ");
                        int[] shape = new int[values.length];
                        int i = 0;
                        for (String v: values){
                            shape[i] = Integer.parseInt(v);
                            i++;
                        }
                        
                        Integer a = Integer.parseInt(myReader.nextLine());
                        
                        if (flag){
                            t1.setItem(shape, a);
                        } else{
                            t2.setItem(shape, a);
                        }
                    } else if (line.equals("GETDATA")){
                        System.out.print("GEDATA\n");
                        if (myReader.nextLine().equals("1")){
                            System.out.println(t1.getData());
                        } else{
                            System.out.println(t2.getData());
                        }
                    } else if (line.equals("READ")){
                        System.out.print("READ\n");
                        if (myReader.nextLine().equals("1")){
                            t1.readJson();
                            System.out.println(t1);
                        } else{
                            t2.readJson();
                            System.out.println(t2);
                        }
                    } else if (line.equals("WRITE")){
                        System.out.print("WRITE\n");
                        String a = myReader.nextLine();
                        if (a.equals("1")){
                            t1.writeJson();
                        } else{
                            t2.writeJson();    
                        }
                        System.out.println("Tensor t" + a + " is successfully written to the file!");
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
