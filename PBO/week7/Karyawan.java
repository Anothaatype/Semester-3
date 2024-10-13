public class Karyawan {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    // Setter Nama
    public void setNama(String nama){
        this.nama=nama;
    }

    // Setter Nip
    public void setNip(String nip){
        this.nip=nip;
    }

     // Setter Golongan
     public void setGolongan(String golongan){
        this.golongan=golongan;
    
    switch(golongan.charAt(0)){
        case '1' : this.gaji=5000000;
            break;
        case '2' : this.gaji=3000000;
            break;
        case '3' : this.gaji=2000000;
            break;
        case '4' : this.gaji=1000000;
            break;
        case '5' : this.gaji=7500000;
            break;
        }
     }

     // Setter Gaji 
     public void setGaji(double gaji){
        this.gaji=gaji;
     }

     // Getter Nama 
     public String getNama(){
        return nama;
     }

     //Getter NIP 
     public String getNip(){
        return nip;
     }

     //Getter Golongan 
     public String getGolongan(){
        return golongan;
     }

     //Getter Gaji 
     public double getGaji(){
        return gaji;
     }
}
