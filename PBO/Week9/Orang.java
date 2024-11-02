public class Orang {
    
    // Attribute 
    private String nama;
    private Hewan hewanPeliharaan;

    // Konstruktor Orang 
    public Orang(String nama){
        this.nama = nama;
    }

    //Kontruktor Peliharaan Hewan
    public void peliharaanHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku" + this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara :");
        this.hewanPeliharaan.bergerak();
        System.out.println("=========================================");
    }
}
