package org.javapractices.lab8.task7_1;

abstract class Book implements Edition {
    private int printings;
    private String title;
    private String authors;
    private float price;


    Book(String title, int printings, String authors, float price) {
        this.title = title;
        this.printings = printings;
        this.authors = authors;
        this.price = price;
    }

    @Override
    public int getPrintings() { return printings; }

    @Override
    public String getTitle() { return title; }

    @Override
    public String getAuthors() { return authors; }

    @Override
    public float getPrice() { return price; }
    
    @Override
    public void setPrintings(int n) { printings = n; }
    
    @Override
    public void setTitle(String s) { this.title = s; }
    
    @Override
    public void setAuthors(String authors) { this.authors = authors; }

    @Override
    public void setPrice(float p) { this.price = p; }

    @Override
    public String toString() {
        return "Book : " +
                "printings: " + printings +
                "\ntitle: " + title +
                "\nauthors: " + authors +
                "\nprice: " + price + "\n";
    }
}
