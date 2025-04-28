package com.azardhel.books;

public abstract class Document {
    private String title;
    private int year;

    Document(String title, int year)
    {
        this.title = title;
        this.year = year;

    }

    String getTitle()
    {
        return title;
    }

    int getYear()
    {
        return year;
    }

    abstract void displayInfo();
}
