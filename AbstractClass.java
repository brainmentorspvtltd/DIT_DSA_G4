abstract class Loan {
    // concrete method
    void applyLoan() {
        System.out.println("Apply for loan...");
    }
    // abstract method
    abstract void emi();
    abstract void roi();
}

class HomeLoan extends Loan {

    @Override
    void emi() {
        System.out.println("EMI for Home Loan");
    }

    @Override
    void roi() {
        System.out.println("ROI for Home Loan...");
    }

}

class CarLoan extends Loan {
    @Override
    void emi() {
        System.out.println("EMI for Home Loan");
    }

    @Override
    void roi() {
        System.out.println("ROI for Home Loan...");
    }
}

class EduLoan extends Loan {
    @Override
    void emi() {
        System.out.println("EMI for Home Loan");
    }

    @Override
    void roi() {
        System.out.println("ROI for Home Loan...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Loan loan = new Loan();
        // Loan loan = new HomeLoan();
        // Loan.applyLoan();
        HomeLoan loan = new HomeLoan();
        loan.applyLoan();
        loan.emi();
    }
}
