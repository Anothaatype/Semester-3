public class Member {
        private String name;
        private String address;
        private String KTP; // Changed to String to match the provided test code
        private float deposit;
        private float loanLimit;
        private float loanAmount;
    
        // Constructor
        public Member(String KTP, String name, float loanLimit) {
            this.KTP = KTP;
            this.name = name;
            this.address = ""; // Default address is an empty string
            this.deposit = 0; // Default deposit is 0
            this.loanLimit = loanLimit; // Set loan limit from the constructor
            this.loanAmount = 0; // Initial loan amount is 0
        }
    
        // Setters
        public void setName(String name) {
            this.name = name;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        // Getters
        public String getName() {
            return name;
        }
    
        public String getAddress() {
            return address;
        }
    
        public float getDeposit() {
            return deposit;
        }
    
        public float getLoanLimit() {
            return loanLimit;
        }
    
        public float getLoanAmount() {
            return loanAmount;
        }
    
        // Method to add deposit
        public void deposit(float money) {
            deposit += money;
        }
    
        // Method to borrow money
        public void borrow(float money) {
            if (loanAmount + money <= loanLimit) { // Check if borrowing exceeds the loan limit
                loanAmount += money;
                System.out.println("Loan approved for: " + money);
            } else {
                System.out.println("Loan exceeds the limit. Maximum allowed: " + (loanLimit - loanAmount));
            }
        }
    
        // Method to repay loan with a minimum 10% installment requirement
        public void installments(float money) {
            float minimumInstallment = loanAmount * 0.10f; // Calculate 10% of the current loan amount
            if (money < minimumInstallment) {
                System.out.println("Sorry, installments must be at least 10% of the loan amount.");
            } else if (money > loanAmount) {
                System.out.println("Installment exceeds the current loan amount. Only paying off the current loan.");
                loanAmount = 0;
             } else {
                loanAmount -= money;
            }
        }
    }
    
