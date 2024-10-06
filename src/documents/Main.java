package documents;

public class Main {
    public static void main(String[] args) {
        Document pdf = DocumentFactory.createDocument("PDF");
        pdf.create();

        Document word = DocumentFactory.createDocument("Word");
        word.create();

    }
}
