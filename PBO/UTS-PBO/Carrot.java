public class Carrot extends Crop {
    public Carrot() {
        super("Carrot", 5, 4); // Carrot takes 5 days to grow, needs 4 units of water
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Corn! You got 3 units of Carrot.");
    }

    @Override
    protected String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}

