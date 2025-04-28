package com.azardhel.books;

public class Magazine extends Document {
    private int numero; 

    Magazine(String title, int year, int numero)
    {
        super(title, year);
        this.numero = numero;
    }

    @Override
    void displayInfo() {
       System.out.print("Magazine: "+getTitle()+" (Numéro: +"+numero+", "+getYear()+")");
    }
}
