package org.javapractices.lab8.task7_1;

public class Encyclopedia extends Book{
    
    private int items;
    
    Encyclopedia(String title, int n, String authors, float price, int items) {
        super(title, n, authors, price);
        this.items = items;
        
    }

    public int getItems() { return items; }

    public void setItems(int items) { this.items = items; }
       
    @Override
    public String toString() {
        return "Encyclopedia " +
                "\ntitle: " + getTitle() +
                "\nauthors: " + getAuthors() + "\n";
    }
}
