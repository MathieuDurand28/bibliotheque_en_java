package com.azardhel.books;

public class Book extends Document implements Borrowable {

    private String auteur;

    Book(String title, int year, String auteur)
    {
        super(title, year);
        this.auteur = auteur;
    }

    @Override
    void displayInfo() {
        System.out.println("Livre: "+getTitle()+" ("+getYear()+") - Auteur: "+auteur);
    }
    
    @Override
    public void borrow() {
        System.out.println(getTitle()+" est empruntable !");
    }

    @Override
    public void returnItem() {
         
    }
}
