package week;

public class Demo01 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,78};
        int [] b=new int[6];
//        System.arraycopy(a,0,b,0,5);
//        for(int i:b){
//            System.out.println(i);
//        }
        System.arraycopy(a,1,b,1,2);
        System.arraycopy(a,3,b,4,2);

    }
}
