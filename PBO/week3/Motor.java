public class Motor {
// instansiasi atribut
    public int speed = 0;
    public boolean motorOn=false;
 

    // Method Start Engine 
    public void startEngine(){
        motorOn=true;
    }

    // Method Turn Off Engine
    public void turnOffEngine(){
        motorOn=false;
        speed=0;
    }

    //Method Increase Engine
    public void increaseEngine(){
        if (motorOn==true) {
           if ( speed + 5 > 100) {
            speed = 100;
            System.out.println("Maximum Speed Reach");
           }
           else{
            speed+=5;
           }
        }
        else{
            System.out.println("Motor Cycle Off");
        }
    }

    // Method Reduce engine
    public void reduceEngine(){
        if (motorOn==true) {
            speed-=5;
        }
        else{
            System.out.println("Motor Cycle Off");
        }
    }

    // Method Status Print
    public void statusPrint(){
         if(motorOn==true){
             System.out.println("Motor Cycle On");
         }
         else{
            System.out.println("Motor Cycle Off");
         }
         System.out.println("Speed " + speed + "\n");
     }
}
