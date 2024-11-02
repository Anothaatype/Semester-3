public class Rektor {
    // Attribute 
    private String nama;

    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat ! silahkan perkenalkan diri Anda..");

        mahasiswa.printNama();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("=========================================================");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat ! Bagaimana anda bisa berprestasi");

        mahasiswa.menjuaraiKompetesi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("=========================================================");
    }
}
