package chapter4;

public class Main {
//https://github.com/Carolista/java-lecture-examples/blob/solution/JavaExamples/src/main/java/chapter05/Book.java
    public static void main(String[] args) {
        System.out.println(Book.getNextIdNum());

        Library library = new Library();

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        System.out.println("\nBook 1 has an ID of " + book1.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        System.out.println("Book 2 has an ID of " + book2.getBookId());
        System.out.println(Book.getNextIdNum());

        Book book3 = new Book("1984", "George Orwell");
        System.out.println("Book 3 has an ID of " + book3.getBookId());
        System.out.println(Book.getNextIdNum());



        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();

        book1.checkOut();

        library.printAvailableBooks();

        book2.checkOut();
        book1.checkIn();

        library.printAvailableBooks();

    }
}