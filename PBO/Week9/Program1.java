public class Program1 {
    public static void main(String[] args) {

        // Object Peliharaan Hewan 
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        // Object Orang 
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        // Integrate Hewan.Bergerak 
        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbaLumba);

        // Method Orang - Ajak Peliharaan Jalan-Jalan 
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
