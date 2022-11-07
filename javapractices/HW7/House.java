package org.javapractices.HW7;

public class House {
    int numOfWindows, numOfDoors;
    Window[] windows;
    Door[] doors;
    
    House(){
        numOfWindows = 1;
        numOfDoors = 1;
        doors[0] = new Door(1);
        windows[0] = new Window(1);
    }
    
    House(int numOfWindows, int numOfDoors){
        this.numOfWindows = numOfWindows;
        this.numOfDoors = numOfDoors;
        doors = new Door[numOfDoors];
        windows = new Window[numOfWindows];
        for (int i = 0; i < Math.max(numOfDoors, numOfWindows); i++){
            if (i < numOfDoors) doors[i] = new Door(i+1);
            if (i < numOfWindows) windows[i] = new Window(i+1);
        }
    }
    
    public void changeDoor(int n){
        for(int i = 0; i < numOfDoors; i++){
            if (doors[i].num == n){
                if (doors[i].open.equals("open")) doors[i].CloseTheDoor();
                else doors[i].OpenTheDoor();
                break;
            }
        }
    }
    
    public void showAllDoors(){
        for (Door d: doors)
            System.out.println(d);
    }
    
    public void showAllWindows(){
        for (Window w: windows)
            System.out.println(w);
    }
}
