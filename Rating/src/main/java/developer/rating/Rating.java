package developer.rating;

import java.util.*;

public class Rating {

    public static void main(String[] args) {


        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Sherlock Holmes", 2017, 8.7));
        bookList.add(new Book("Sherlock Holmes", 2017, 8.7));
        bookList.add(new Book("Criminal", 2012, 8.1));
        bookList.add(new Book("London", 2012, 6.7));
        bookList.add(new Book("Coding", 2019, 9.0));
        bookList.add(new Book("DC", 2014, 7.9));

        bookList.removeIf(book -> book.getRate() < 8 || book.getYear() < 2010);

        bookList.sort(Comparator.comparing(Book::getRate, Comparator.reverseOrder()));

        System.out.println(bookList);








    }
}
