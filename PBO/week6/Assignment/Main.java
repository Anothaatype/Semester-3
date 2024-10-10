public class Main {
    public static void main(String[] args) {
       
        Dosen dosen1 = new Dosen("1234", "Baskoro", "Jl.Geronjal Amaril");
        dosen1.setSKS(17); 

        Dosen dosen2 = new Dosen("5678", "Seno", "JL.Dengkol Asri");
        dosen2.setSKS(16); 

        
        DaftarGaji daftarGaji = new DaftarGaji(2);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        
        daftarGaji.printSemuaGaji();
    }
}
