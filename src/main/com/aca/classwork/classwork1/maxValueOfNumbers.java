package com.aca.classwork.classwork1;

public class maxValueOfNumbers {
    public static void main(String[] args) {
        long max = max(15, 98);
        long i1=541645;
        long i2=145;
        long i3=614;
        long i4 =9087;
        long i5=98876;
//        long max1 = max(15, 34);
//        long max2=max(i1 , max1);
//        long max3 = max(i2, max2);
//        long max4=max(i3,max3);
//        long max5 = max(i4 ,max4);
//        long max6 = max(i5,max5);

        long result = max(
                i1,
                max(
                        i2,
                        max(
                                i3,
                                max(i4,i5)
                        )
                )
        );
    }

    public static long max(long a, long b) {
        System.out.println("a = " + a + ", b = " + b);
        return a>b ? a:b ;
/*
        if (i1 > i2) {
            return i1;
        } else {
            return i2;
        }
*/
    }
}
