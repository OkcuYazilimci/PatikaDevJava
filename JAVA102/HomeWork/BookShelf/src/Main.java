import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book = new TreeSet<>();
        book.add(new Book("Dance with the stars", 568, "Vegas black",
                "01.10.2000"));
        book.add(new Book("lorem with the stars", 354, "Vegas black",
                "01.10.2000"));
        book.add(new Book("param with the stars", 11, "Vegas black",
                "01.10.2000"));
        book.add(new Book("MUNDance with the stars", 1345, "Vegas black",
                "01.10.2000"));
        book.add(new Book("yordle with the stars", 200, "Vegas black",
                "01.10.2000"));

        for(Book b : book) {
            System.out.println(b.getName() + ", " + b.getTotalPage());
        }
    }
}