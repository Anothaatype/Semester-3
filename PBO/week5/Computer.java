public class Computer {

    // Attribute Computer 
    private String brand;
    private Processor proc; 

    // Parametric Constructor
    public Computer ( String brand, Processor proc){
        this.brand = brand;
        this.Processor = proc;
    }

    // No-argument Constructor (Default)
    public Computer() {
        // Default values
        this.brand = "";
        this.proc = new Processor(); // Instantiate a default Processor
    }

    // Getter and Setter forx brand 
    public String getBrand(String brand) {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for Processor
    public Processor getProc(Processor proc){
        return proc;
    }

    public Processor setProc(Processor proc){
        return proc;
    }
    // Method 
    public void info(){
        System.out.println("Computer Brand = " + brand);
        proc.info();
    }
}
