package documents;

public class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("PDF")) {
            return new PDFDocument();
        } else if (type.equalsIgnoreCase("Word")) {
            return new WordDocument();
        }
        throw new IllegalArgumentException("Неизвестный тип документа: " + type);
    }
}

