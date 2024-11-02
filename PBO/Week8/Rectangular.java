public class Rectangular implements Ishape {

    // Attribute
    int p;
    int l;

    @Override
    public int getAreaR(int p, int l) {
        int area = p * l;
        return area;
    }

    @Override
    public int getPerimeterR(int p, int l) {
        int perimeter = ( 2 * p ) + ( 2 * l);
        return perimeter;
    }

    @Override
    public float getAreaC(float r) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getPerimeterC(float r) {
        // TODO Auto-generated method stub
        return 0;
    }
}
