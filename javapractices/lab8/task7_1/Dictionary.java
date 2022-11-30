package org.javapractices.lab8.task7_1;


class Dictionary extends Book {
    private String firstLang;
    private String secondLang;
    private int items;


    Dictionary(String title, int n, String authors, float price) {
        super(title, n, authors, price);
    }

    public Dictionary(String title, int n, String authors, float price, String l1, String l2, int items) {
        this(title, n, authors, price);
        this.firstLang = l1;
        this.secondLang = l2;
        this.items = items;
    }

    public void setFirstLang(String l1) { firstLang = l1; }

    public void setSecondLang(String l2) { secondLang = l2; }

    public void setItems(int n) { items = n; }

    public String getLang1() { return firstLang; }

    public String getLang2() { return secondLang; }

    public int getItems() { return items; }

    @Override
    public String toString() {
        return "Dictionary: " +
                "\nfrom " + firstLang +
                " to " + secondLang + 
                "\nprintings: " + getPrintings() +
                "\ntitle: " + getTitle() +
                "\nauthors: " + getAuthors() +
                "\nprice: " + getPrice() + "\n";
    }
}
