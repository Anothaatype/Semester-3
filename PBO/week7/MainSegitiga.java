public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        //Testing the Overloaded Methods 
        System.out.println("Total Sudut 1 : " + segitiga.totalSudut(60));
        System.out.println("Total Sudut 2 : " + segitiga.totalSudut(120, 80));
        System.out.println("Keliling 3 sides : " + segitiga.keliling(5, 7, 12));
        System.out.println("Keliling 2 sides : " + segitiga.keliling(3, 4));
    }
}
