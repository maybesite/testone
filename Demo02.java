package week;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Demo02 {


    public static void main(String[] args) {
        Random x =new Random(100000);
        int[] c=new int[10000];
        for(int i=0;i<10000;i++) {
            c[i] = x.nextInt();

        }
        long begin=System.currentTimeMillis();

        Arrays.sort(c);
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
