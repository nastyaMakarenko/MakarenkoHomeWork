
public class Book {

    String name;
    String author;
    int year;

    public Book (String name, String author, int year){

        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void showBook (){

        System.out.printf("Name: %s /d Author: %s /d Year: %d ", name, author, year);
    }

    public String getName(){

        return name;
    }

    public String getAuthor(){

        return author;
    }

    public int getYear(){

        return year;
    }
}
