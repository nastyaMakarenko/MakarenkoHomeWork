import library.Book;

public class Reader extends Human{

    public Book[] books = new Book[3];
    //Human reader = new Reader();

    public Reader(){

    }

    public Reader (String name, String phone, int age, Book book1, Book book2, Book book3){

        super(name, age, phone);
        this.books[0] = book1;
        this.books[1] = book2;
        this.books[2] = book3;
    }

    public Reader (String name, String phone, int age, Book book1, Book book2){

        super(name, age, phone);
        this.books[0] = book1;
        this.books[1] = book2;
    }

    public Reader (String name, String phone, int age, Book book1){

        super(name, age, phone);
        this.books[0] = book1;
    }

    public void showReader (){

        System.out.printf("Reader: %s /d Age: %d /d Phone: %s", name, age, phone);
        showReaderBooks();
    }

    public void showReaderBooks(){

        for (int i = 0; i < books.length; i++) {
            books[i].showBook();
        }
    }


}
