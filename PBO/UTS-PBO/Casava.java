public class Casava extends Crop {
    public Casava() {
        super("Casava", 8, 9); // Casava takes 8 days to grow, needs 9 units of water
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting Corn! You got 12 units of Casava.");
    }

    @Override
    protected String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
