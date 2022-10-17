
package org.javapractices.lab6;



public class Student {
    String name, lastname;
    String dateOfBirth, address, faculty;
    int group, phoneNumber, course;
    
    Student(){
        name = "Undefined";
        lastname = "Undefined";
        dateOfBirth = "00.00.0000";
        address = "N.";
        faculty = "NN";
        group = 0;
        phoneNumber = 0;
        course = 0;
    }
    
    Student(String[] arr){
        name = arr[0];
        lastname = arr[1];
        dateOfBirth = arr[2];
        address = arr[3];
        faculty = arr[4]; 
        group = Integer.parseInt(arr[5]);
        phoneNumber = Integer.parseInt(arr[6]);
        course = Integer.parseInt(arr[7]);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setGroup(int group){
        this.group = group;
    }
    
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setCourse(int course){
        this.course = course;
    }
    
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLastname(){
        return lastname;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getGroup(){
        return group;
    }
    
    public int getPhoneNumber(){
        return phoneNumber;
    }
    
    public int getCourse(){
        return course;
    }
    

    @Override
    public String toString(){
        String data = "\nStudent:";
        data += name + " " + lastname;
        data += "\ndate of birth: " + dateOfBirth;
        data += "\naddress: " + address;
        data += "\ngroup: " + Integer.toString(group);
        data += "\nphone number: " + Integer.toString(phoneNumber);
        data += "\ncourse: " + Integer.toString(course) + "\n";
        return data;
    }
}
