public class Program2 {
    public static void main(String[] args) {
        
        // Object 
        Rektor pakRektor = new Rektor();
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // Instatiate Value Through Konstruktor 
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa); - Mahasiswa tidak mengimplementasi ICumlaude
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
