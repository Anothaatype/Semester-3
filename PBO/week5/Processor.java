public class Processor {
    private String brand;
    private double cache;

    // Parametric Constructor
    public Processor (String brand, double cache){
        this.brand = brand;
        this.cache = cache;
    }

    // No-argument Constructor (Default)
    public Processor() {
        // Default values
        this.brand = "";
        this.cache = 0.0;
    }

    // Getter and Setter for brand 
    public String getBrand(String brand) {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for cache 
    public double getCache(double cache) {
        return cache;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }

    // Method Info 
    public void info(){
        System.out.println("Brand Processor = %s\n", brand);
        System.out.println("Cache Memory = %.2f\n", cache);
    }
}
