package org.javapractices.HW8.task7_15;

public class DrawingNotebook extends Notebook{
    private int num_of_pages;
    
    DrawingNotebook() { super(); }
    
    DrawingNotebook(String color, String size, String manufacturer){
        super(color, size, manufacturer);
    }
    
    DrawingNotebook(String color, String size, String manufacturer, int num_of_pages){
        super(color, size, manufacturer);
        this.num_of_pages = num_of_pages;
    }
    
    public int getNumOfPages() { return num_of_pages; }
    
    public void setNumOfPages(int num_of_pages) { this.num_of_pages = num_of_pages; } 

    @Override
    public String toString(){
        return "Drawing notebook\npages: " + num_of_pages;
    }
    
}
