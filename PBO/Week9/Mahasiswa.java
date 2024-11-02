public class Mahasiswa{
    protected String nama;

    public Mahasiswa(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void kuliahDiKampus(){
        System.out.println("Aku berkuliah di kampus.");
    }
}
