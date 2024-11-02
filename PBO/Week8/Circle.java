public class Circle implements Ishape {
   
    @Override
    public float getAreaC(float r) {
       float area = (22 / 7) * ( r * r );
        return area; 
    }

    @Override
    public float getPerimeterC(float r) {
        float perimeter = (22 / 7) * (r + r);
        return perimeter;
    }

    @Override
    public int getAreaR(int p, int l) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getPerimeterR(int p, int l) {
        // TODO Auto-generated method stub
        return 0;
    }
}
