package oopsRealtime;
/*
real-world project—a Loan Management System—that leverages inheritance with
robust business logic. In this project, a base abstract class represents a
generic loan, and concrete subclasses implement specific loan types (home, car, and personal)
with their own eligibility criteria and monthly payment calculations.
 */
abstract class Loan {
    protected double principal;
    protected double annualInterestRate;
    protected int termInYears;

    public Loan(double principal, double annualInterestRate, int termInYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.termInYears = termInYears;
    }

    // Calculate the monthly payment using the standard amortization formula:
    // M = P * (r(1+r)^n) / ((1+r)^n - 1)
    public double calculateMonthlyPayment() {
        double monthlyRate = annualInterestRate / 12 / 100;
        int totalMonths = termInYears * 12;
        return principal * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)
                / (Math.pow(1 + monthlyRate, totalMonths) - 1);
    }

    // Abstract method to enforce eligibility criteria specific to each loan type
    public abstract boolean isEligible();

    // Display general loan information along with the calculated monthly payment
    public void displayLoanInfo() {
        System.out.println("Principal: $" + principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Term: " + termInYears + " years");
        System.out.printf("Monthly Payment: $%.2f%n", calculateMonthlyPayment());
    }
}
    // HomeLoan subclass with its own business logic for eligibility
    class HomeLoan extends Loan {
        private double propertyValue;
        private double downPayment;

        public HomeLoan(double principal, double annualInterestRate, int termInYears,
                        double propertyValue, double downPayment) {
            super(principal, annualInterestRate, termInYears);
            this.propertyValue = propertyValue;
            this.downPayment = downPayment;
        }

        @Override
        public boolean isEligible() {
            // Eligibility: Down payment must be at least 20% of the property's value.
            return downPayment >= 0.20 * propertyValue;
        }
    }
// CarLoan subclass with its own eligibility rule
class CarLoan extends Loan {
    private int carAge; // in years

    public CarLoan(double principal, double annualInterestRate, int termInYears, int carAge) {
        super(principal, annualInterestRate, termInYears);
        this.carAge = carAge;
    }

    @Override
    public boolean isEligible() {
        // Eligibility: The car must be 5 years old or newer.
        return carAge <= 5;
    }
}

// PersonalLoan subclass with a different eligibility condition
class PersonalLoan extends Loan {
    private double monthlyIncome;

    public PersonalLoan(double principal, double annualInterestRate, int termInYears, double monthlyIncome) {
        super(principal, annualInterestRate, termInYears);
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public boolean isEligible() {
        // Eligibility: The calculated monthly payment should be less than 40% of the applicant's monthly income.
        double monthlyPayment = calculateMonthlyPayment();
        return monthlyPayment < 0.40 * monthlyIncome;
    }
}

public class LoanRunner {
    public static void main(String[] args) {
        // Create instances of different loan types
        Loan homeLoan = new HomeLoan(200000, 4.5, 30, 250000, 60000);
        Loan carLoan = new CarLoan(30000, 7.0, 5, 3);
        Loan personalLoan = new PersonalLoan(10000, 10.0, 3, 3000);

        // Process Home Loan
        System.out.println("=== Home Loan ===");
        System.out.println("Eligibility: " + (homeLoan.isEligible() ? "Eligible" : "Not Eligible"));
        homeLoan.displayLoanInfo();

        System.out.println("\n---------------------\n");

        // Process Car Loan
        System.out.println("=== Car Loan ===");
        System.out.println("Eligibility: " + (carLoan.isEligible() ? "Eligible" : "Not Eligible"));
        carLoan.displayLoanInfo();

        System.out.println("\n---------------------\n");

        // Process Personal Loan
        System.out.println("=== Personal Loan ===");
        System.out.println("Eligibility: " + (personalLoan.isEligible() ? "Eligible" : "Not Eligible"));
        personalLoan.displayLoanInfo();
    }
}
