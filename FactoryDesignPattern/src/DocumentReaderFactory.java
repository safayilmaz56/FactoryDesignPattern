public class DocumentReaderFactory {
    public IDocumentReader Get(String readerType){
        switch (readerType){
            case "PDF":
                return new PDFReader();
            case "MsWord":
                return new MsWordReader();
            default:
                return new PDFReader();
        }
    }
}
