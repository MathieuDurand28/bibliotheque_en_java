package com.azardhel.books;

public class App 
{
    public static void main( String[] args )
    {
        Library bibliotheque = new Library();

        Book livre1 = new Book("Harry potter et l'école du sorcier", 1998, "JK. Rowling");
        Book livre2 = new Book("Le seigneur des anneaux", 1945, "Tolkien");

        Magazine playboy = new Magazine("Playboy", 2015, 1258);

        bibliotheque.addDocument(playboy);
        bibliotheque.addDocument(livre1);
        bibliotheque.addDocument(livre2);

        bibliotheque.showAllDocuments();

        bibliotheque.showBorrowableItems();
    }
}
