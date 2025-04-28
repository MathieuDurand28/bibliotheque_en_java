package com.azardhel.books;

import java.util.ArrayList;

public class Library {
    private ArrayList<Document> docs = new ArrayList<>();
    
    void addDocument(Document d)
    {
        docs.add(d);
    }

    void showAllDocuments()
    {
        for (Document paper : docs)
        {
            paper.displayInfo();
        }
    }

    void showBorrowableItems()
    {
        //System.out.println("\n");
        System.out.println("-- Empruntables: ");
        for (Document paper : docs)
        {
            if (paper instanceof Borrowable)
            {
                ((Borrowable)paper).borrow();
            }
        }
    }
}
