public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    //Setter Lembur
    public void setLembur(int Lembur){
        this.lembur = lembur;
    }

    //Getter Lembur 
    public int getLembur(){
        return Lembur;
    }

    //Setter Gaji Lembur 
    public void setGajiLembur(double gajiLembur){
        this.gajilembur = gajilembur;
    }

    //Getter Gaji Lembur 
    public double getGajiLembur(){
        return gajiLembur;
    }

    // Overloading 
    public double getGaji(int lembur, double gajiLembur){
        return super.getGaji()+lembur*gajiLembur;
    }

    //Overriding 
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }

    //Method Lihat Info
    public void lihatInfo(){
        System.out.println("NIP :" + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.println("Jml Lembur :" + this.getLembur());
        System.out.println("Gaji Lembur : %.0f\n", this.getGajiLembur());
        System.out.println("Gaji :%.0f\n", this.getGaji());
    }
}
