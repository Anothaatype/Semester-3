public class MainExperiment1 {
    public static void main(String[] args) {
        
        // Based Processor 
        Processor p = new Processor("Intel i5", 3);

        // Laptop Object 
        Computer l = new Computer("Thinkpad", p);
        
        //Calling Method
        l.info();

        System.out.println("+-----------------------------+");

        //Instantiate Processor Object 1
        Processor p1 = new Processor();
        p1.setBrand("Intel i5");
        p1.setCache(4);

        //Instantiate Computer Object 1 
        Computer c1 = new Computer();
        c1.setBrand("Thinkpad");
        c1.setProc(p1);
        c1.info();

        System.out.println("+-----------------------------+");
    }
}
