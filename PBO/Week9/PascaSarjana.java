public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    
    public PascaSarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih daor 3,71");
    }

    @Override
    public void printNama(){
        System.out.println("Aku Mahasiswa, namaku " + nama);
        kuliahDiKampus();
    }

    @Override
    public void menjuaraiKompetesi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
}
