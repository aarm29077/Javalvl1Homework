package homework;
/*
Classwork1
the first option to solve the problem, the second option in case of minimum value
 */
public class FirstQuestion {
    public static void main(String[] args) {
        long max = max(15, 98);
        long a=541645;
        long b=145;
        long c=614;
        long max1;
        long max2;
        long max3;
        if (a>max) {
            max1=a;
        }else{
            max1 = max(15,98);
        }
        if (b>max1){
            max2 = b;
        }else {
            max2 = max1;
        }
        if (c>max2){
            max3 = c;
        }else{
            max3=max2;
        }
        System.out.println(max3);
    }

    public static long max(long i1, long i2) {
        if (i1 > i2) {
            return i1;
        } else {
            return i2;
        }
    }
}
