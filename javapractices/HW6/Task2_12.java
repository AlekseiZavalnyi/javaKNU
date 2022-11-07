package org.javapractices.HW6;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class Task2_12 {
    public static void main(String[] args) throws ParseException{
        Airline[] list = new Airline[] {
            new Airline("A", "001", "17.10.2023", new String[] {"Monday", "Sunday"}, 987),
            new Airline("B", "002", "23.10.2023", new String[] {"Tuesday", "Thursday", "Saturday"}, 156),
            new Airline("A", "003", "24.10.2023", new String[] {" Monday", "Wednesday", "Friday"}, 777),
            new Airline("D", "004", "16.10.2023", new String[] {"Sunday"}, 585),
            new Airline("E", "001", "19.10.2023", new String[] {" Monday", "Tuesday", "Wednesday"}, 657)};
    
    
        Scanner in = new Scanner(System.in);
        String command = "end";
        do{
            System.out.print("\nEnter command: ");
            command = in.nextLine();
            if (command.equals("destination")){
                System.out.print("\nEnter destination: ");
                command = in.nextLine();
                for (Airline a: list){
                    if (a.getDestination().equals(command))
                        System.out.print(a.toString());
                }
            }
            else if(command.equals("data")){
                System.out.print("\nEnter data: ");
                command = in.nextLine();
                Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(command);  
                for (Airline a: list){
                    Date date2 = new SimpleDateFormat("dd.MM.yyyy").parse(a.getTimeOfDeparture());  
                    if (date2.compareTo(date1) > 0)
                        System.out.print(a.toString());
                }
            }
            else if(command.equals("day")){
                System.out.print("\nEnter day: ");
                command = in.nextLine();
                for (Airline a: list){
                    String[] arr = a.getDays();
                        for (String s: arr){
                            if (s.equals(command))
                                System.out.print(a.toString());
                        }
                }
            }
            
        }while(!command.equals("end"));
}
    
    
    
}
