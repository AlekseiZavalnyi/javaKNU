package org.javapractices.HW6;

public class Airline {
    String destination, aircraft_type, time_of_departure;
    String[] days = new String[7];
    int number_of_flight;
    
    Airline(){
        destination = "Undefined";
        aircraft_type = "Undefined";
        time_of_departure = "Undefined";
        number_of_flight = 0;
        for (int i = 0; i < days.length; i++)
            days[i] = "Undefined";
    }
    
    Airline (String destination, String aircraft_type, String time_of_departure,
            String[] days, int number_of_flight){
        this.destination = destination;
        this.aircraft_type = aircraft_type;
        this.time_of_departure = time_of_departure;
        this.days = days;
        this.number_of_flight = number_of_flight;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public void setAircraftType(String aircraft_type){
        this.aircraft_type = aircraft_type;
    }
    
    public void setTimeOfDeparture(String time_of_departure){
        this.time_of_departure = time_of_departure;
    }
    
    public void setDays(String[] days){
        this.days = days;
    }
    
    public void setNumberOfFlight(int number_of_flight){
        this.number_of_flight = number_of_flight;
    }
    
    public String getDestination(){
        return destination;
    }
    
    public String getAircraftType(){
        return aircraft_type;
    }
    
    public String getTimeOfDeparture(){
        return time_of_departure;
    }
    
    public String[] getDays(){
        return days;
    }
    
    public int getNumberOfFlight(){
        return number_of_flight;
    }
    
    @Override
    public String toString(){
        String data = "\nAirline:";
        data += Integer.toString(number_of_flight) + " " + time_of_departure;
        data += "\naircraft type: " + aircraft_type;
        data += "\ndestination: " + destination;
        data += "\ndays: ";
        for (String s: days){
            if (!s.equals("Undefined"))
                data += " " + s;
        }
        data +=  "\n";
        return data;
    }
}
