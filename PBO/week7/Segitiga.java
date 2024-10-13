public class Segitiga {
    int sudut = 180;

    //Overloaded method 1 : One Paramater (int) 
    int totalSudut(int sudutA){
        return sudut - sudutA;
    }

    //Overloaded method 2 : Two Paramater (int) 
    int totalSudut(int sudutA, int sudutB){
        return sudut - (sudutA + sudutB);
    }

    //Overloaded method 3 : Three Paramater (int) 
    int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }

    //Overloaded method 4 : Two Paramater (int), return type is double 
    double keliling(int sisiA, int sisiB){
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

}
