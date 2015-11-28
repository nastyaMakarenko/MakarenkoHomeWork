package library;

import library.Book;

public class Library {

    public int booksSize;
    public Book[] freeBooks = new Book[10];

    public void addBook (String name, String author, int year){

        if (booksSize < freeBooks.length){
            resizeBooksArr();
        }

        freeBooks[booksSize] = new Book(name, author, year);
        booksSize++;
    }

    public void resizeBooksArr(){

        Book[] helper = new Book[booksSize * 2];
        for (int i = 0; i < booksSize; i++) {
            helper[i] = freeBooks[i];
        }

        freeBooks = helper;
    }

    public void showAllFreeBooks(){

        for (int i = 0; i < freeBooks.length; i++) {
            freeBooks[i].showBook();
        }
    }

    public void showBooksByAuthor (String author){

        int counter = 0;

        for (int i = 0; i < freeBooks.length; i++) {

            if(author.equals(freeBooks[i].getAuthor())){
                freeBooks[i].showBook();
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("No books available by " + author);
        }
    }

    public void showNewBooks(){

        int counter = 0;

        for (int i = 0; i < freeBooks.length; i++) {

            if(freeBooks[i].getYear() > 2013){
                freeBooks[i].showBook();
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("No new books available");
        }
    }

    public boolean checkBookAvailability(Book book){

        boolean res = false;

        for (int i = 0; i < freeBooks.length; i++) {

            if(book.getName().equals(freeBooks[i].getName()) && book.getAuthor().equals(freeBooks[i].getAuthor())){
                res = true;
            }
        }

        return res;
    }
}
