public class PDFReader implements IDocumentReader{
    @Override
    public void Read() {
        System.out.println("PDF ile okuma islemi gerceklestirildi");
    }

    @Override
    public void Extract() {
        System.out.println("PDF ile extract islemi gerceklestirildi");
    }
}
