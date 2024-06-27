public class Main{
    public static void main(String[] args) {
        Book book = new Book("Maui");

        book.setTitle("Coding with Maui");
        book.setIsbn("3625NB");

        book.displayInfos();
        book.loanItem();

        Ebook ebook = new Ebook("Maui", "Coder c'est trop bien");

        ebook.setTitle("Coding is cool");
        ebook.setIsbn("2738UI");

        ebook.displayInfos();
        ebook.loanItem();
        ebook.returnItem();
    }
}