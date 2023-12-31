public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "The Country of the Blind: A Memoir at the End of Sight";
        book.author = "Andrew Leland";
        book.year = 2023;
        book.addtolibrary();

        Book book1 = new Book();
        book1.title = "The Line of Beauty";
        book1.author = " Alan Hollinghurst";
        book1.year = 1980;
        book1.addtolibrary();

    }
}