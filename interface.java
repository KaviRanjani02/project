interface Bank {
    void calculateInterest();
}

class SBI implements Bank {
    double r, amt, interest;

  
    public void calculateInterest() {
        amt = 10000;
        r = 0.07; 
        interest = amt * r;
        System.out.println("SBI Interest = " + interest);
    }
}

class Axis implements Bank {
    double r, amt, interest;
    public void calculateInterest() {
        amt = 10000; 
        r = 0.12; 
        interest = amt * r;
        System.out.println("Axis Interest = " + interest);
    }
}

class Driver {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        sbi.calculateInterest();

        Bank axis = new Axis(); 
        axis.calculateInterest();
    }
}
