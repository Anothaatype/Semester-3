package PBO.week6;

public class ClassB extends ClassA {
    public int z;

    //Method Set Nilai z 
    public void setZ(int z){
        this.z=z;
    }
    //Method Get Nilai z
    public void getNilaiZ(){
        System.out.println("Nilai z : " + z);
    }

    //Method Get Jumlah 
    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}
