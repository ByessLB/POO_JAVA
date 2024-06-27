
public class Book extends LibraryItem implements Loannable {

    private String author;

    public Book(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public void displayInfos() {
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + getIsbn());
    }

    @Override
    public void loanItem() {
        System.out.println("Le livre a été emprunté !");
    }
    @Override
    public void returnItem() {
        System.out.println("Le livre a été rendu !");
    }

}
