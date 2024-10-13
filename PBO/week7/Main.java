public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Dosen(); // Dynamic Method Dispatch
        manusia1.makan(); // Will call dosen Makan
        Manusia manusia2 = new Mahasiswa(); // Dynamic Method Dispatch
        manusia2.makan(); // Will Call mahasiswa Makan 
    }
}
