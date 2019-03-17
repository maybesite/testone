package week;

import java.util.Scanner;

public class BankofDaLian extends Bank{
    double day;
    int a;


    public BankofDaLian(double year, double savemonday, double interestRate,double day,int a) {
        super(year, savemonday, interestRate);
        this.a=a;
        this.day=day;
    }

    public double computeInterest(){
        double o=super.computeInterest(a,savemonday);
        double p=day*0.00012*savemonday;
        return o+p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        double e=sc.nextDouble();
//        double t=sc.nextDouble();
//        int q=(int)e;
//        double day=e-q;
//        BankofDaLian k=new BankofDaLian(e,t,0.35,day,q);
//        double y=k.computeInterest();
//        System.out.println(y);

    }
}
