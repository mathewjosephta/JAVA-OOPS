// Define the Bank interface
interface Bank {
    float rateOfInterest(); // Method to get the rate of interest
}

// Implement the SBI class
class SBI implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.15f; // SBI rate of interest
    }
}

// Implement the PNB class
class PNB implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.7f; // PNB rate of interest
    }
}

// Main class to demonstrate the implementation
public class InterfaceDemo {
    public static void main(String[] args) {
        Bank sbi = new SBI(); // Create an SBI object
        System.out.println("SBI RIO: " + sbi.rateOfInterest()); // Print SBI rate of interest

        Bank pnb = new PNB(); // Create a PNB object
        System.out.println("PNB RIO: " + pnb.rateOfInterest()); // Print PNB rate of interest
    }
}
