package library;

import library.Book;

public class Librarian extends Human {

    public int readersSize;
    public Reader[] readers = new Reader[10];
    public Reader[] blackList = new Reader[10];
    public Library lib = new Library();

    public void addReader (Reader reader, Reader[] arr){

        if (readersSize < arr.length){
            resizeReaderArr(arr);
        }

        arr[readersSize] = reader;
        readersSize++;
    }

    public void resizeReaderArr (Reader[] arr){

        Reader[] helper = new Reader[readersSize * 2];
        for (int i = 0; i < readersSize; i++) {
            helper[i] = arr[i];
        }

        arr = helper;
    }

    public void addReaderToReaders (Reader reader){

        if (checkReaderAvailability(reader.getName(), reader.getPhone(), readers) == false){
            addReader(reader, readers);
        }
        else{
            System.out.println("We have such reader");
        }

    }

     public void addReaderToBL (Reader reader){

         if (checkReaderAvailability(reader.getName(), reader.getPhone(), blackList) == false){
             addReader(reader, blackList);
         }
         else{
             System.out.println("This reader is already in Black List");
         }
     }

    public void showAllReaders(){

        for (int i = 0; i < readers.length; i++) {
            readers[i].showReader();
        }
    }

    public void showAllReadersBooks(){

        for (int i = 0; i < readers.length; i++) {
            readers[i].showReaderBooks();
        }
    }

    public boolean checkReaderAvailability(String name, String phone, Reader[] arr){

        boolean res = false;

        for (int i = 0; i < readers.length; i++) {

            if(name.equals(arr[i].getName()) && phone.equals(arr[i].getPhone())){
                res = true;
            }
        }

        return res;
    }

    public void showCurrentReaderBooks(String name, String phone){

        if (checkReaderAvailability(name, phone, readers) == true){

            for (int i = 0; i < readers.length; i++) {
                if(name.equals(readers[i].getName()) && phone.equals(readers[i].getPhone())){
                    readers[i].showReaderBooks();
                }
            }
        }
        else{
            System.out.println("We don't have such reader");
        }
    }
    
    public Book giveBook (String name, String author, int year){

        Book book = new Book(name, author, year);

        if (lib.checkBookAvailability(book) == false){
            System.out.println("We don't have such book");
            book = null;
        }

        for (int i = 0; i < lib.freeBooks.length; i++) {
            if (lib.freeBooks[i].equals(book)){
                lib.freeBooks = null;
            }
        }

        return book;
    }
}
