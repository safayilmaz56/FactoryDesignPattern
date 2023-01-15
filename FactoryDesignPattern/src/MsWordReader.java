public class MsWordReader implements IDocumentReader{
    @Override
    public void Read() {
        System.out.println("MsWord ile okuma islemi gerceklestirildi");
    }

    @Override
    public void Extract() {
        System.out.println("MsWord ile extract islemi gerceklestirildi");
    }
}
