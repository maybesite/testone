package week;

import java.util.Scanner;

public class Constructbank extends Bank {
    double day;
    int a;


    public Constructbank(double year, double savemonday, double interestRate,double day,int a) {
        super(year, savemonday, interestRate);
        this.a=a;
        this.day=day;
    }

    public double computeInterest(){
        double o=super.computeInterest(a,savemonday);
        double p=day*0.0001*savemonday;
        return o+p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        int a=(int)x;
        double day=x-a;
        Constructbank k=new Constructbank(x,y,0.35,day,a);
        double u=k.computeInterest();
        System.out.println(u);


    }

}
