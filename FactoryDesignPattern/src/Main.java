public class Main {
    public static void main(String[] args) {
        DocumentReaderFactory readerFactory = new DocumentReaderFactory();
        IDocumentReader pdfReader = readerFactory.Get("PDF");
        pdfReader.Read();
    }
}