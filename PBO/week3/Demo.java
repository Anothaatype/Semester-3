import java.util.Scanner; // Import Scanner class to read input from the console

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        // Create a new member
        Member donny = new Member("111333444", "Donny", 5000000);
        System.out.println("Member name: " + donny.getName());
        System.out.println("Loan Limit: " + donny.getLoanLimit());

        // Prompt the user to enter the loan amount
        System.out.print("\nEnter the amount to borrow: ");
        float loanAmount = scanner.nextFloat();
        donny.borrow(loanAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        // Borrow more money based on user input
        System.out.print("\nEnter the amount to borrow again: ");
        loanAmount = scanner.nextFloat();
        donny.borrow(loanAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        // Prompt the user to enter the installment amount
        System.out.print("\nEnter the installment amount: ");
        float installmentAmount = scanner.nextFloat();
        donny.installments(installmentAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        // Pay more installments based on user input
        System.out.print("\nEnter the installment amount again: ");
        installmentAmount = scanner.nextFloat();
        donny.installments(installmentAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
