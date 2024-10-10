package PBO.week6;

public class ClassA {
    public int x;
    public int y;

    //Setter X
    public void setX(int x){
        this.x = x;
    }

    //Setter Y 
    public void setY(int y){
        this.y =y;
    }
    
    //Method Getter Nilai x dan y
    public void getNilai(){
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
    }
}
