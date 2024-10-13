public class Manager {
    public class Manager extends Karyawan{
        private double tunjangan;
        private String bagian;
        private Staff st[];

        //Setter Tunjangan
        public void setTunjangan(double tunjangan){
            this.tunjangan=tunjangan;
        }

        //Getter Tunjangan 
        public double getTunjangan(){
            return tunjangan;
        }

        //Setter Bagian
        public void setBagian(String bagian){
            this.bagian=bagian;
        }

        //Getter Bagian 
        public String getBagian(){
            return bagian;
        }

        //Setter Staff
        public void setStaff(Staff st[]){
            this.st=st;
        }

        //Method View Staff 
        public void viewStaff(){
        System.out.println("-------------------");
        int i;
        for(i=0;i<st.length;i++) {
            st[i].lihatInfo();
        }
        System.out.println("-------------------");
        }

        //Method Lihat info
        public void lihatInfo(){
            System.out.println("NIP :" + this.getNip());
            System.out.println("Nama :" + this.getNama());
            System.out.println("Golongan :" + this.getGolongan());
            System.out.println("Tunjangan : %.0f\n", this.getTunjangan());
            System.out.println("Gaji :%.0f\n", this.getGaji());
            System.out.println("Bagian : " + this.getGajiLembur());
        }
       
        //Overriding
        public double Getgaji(){
            return super.getGaji()+tunjangan;
        }
    }
}
