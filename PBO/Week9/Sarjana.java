public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {

    // Attribute Dari Super Class Mahasiswa 
    public Sarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void printNama(){
        System.out.println("Aku Mahasiswa, namaku " + nama);
        kuliahDiKampus();
    }

    @Override
    public void menjuaraiKompetesi() {
        System.out.println("Saya telah men juarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
