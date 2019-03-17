package week;

public class Bank {
    final double interest=0.35;
    double year;
    double savemonday;
    double interestRate;

    public Bank(double year, double savemonday, double interestRate) {
        this.year = year;
        this.savemonday = savemonday;
        this.interestRate = interestRate;
    }

    public double computeInterest(double year, double savemonday){
        return year*0.35*savemonday;
    }
}
