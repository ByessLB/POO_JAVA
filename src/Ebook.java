public class Ebook extends Book {

    private String subject;

    public Ebook(String author, String subject) {
        super(author);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfos() {
        super.displayInfos();
        System.out.println("Subject : " + subject);
    }

}
