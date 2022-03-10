package com.aca.classwork.classwork1;

public class ArrayTest {
    public static void main(String[] args) {
        int []ints =minAndMax(13,56);
        System.out.println(ints[0] + " " + ints[1]);

        int[]ints1 = minAndMax1(12,57);
        System.out.println(ints1[0] + " " + ints1[1]);
    }

    public static int[] minAndMax(int a,int b){
        int array[] = new int[10];

    if(a<b){
        array[0]=a;
        array[1]=b;
    }else {
        array[0]=b;
        array[1]=a;
    }
    return array;
    }
    public static int[] minAndMax1(int i, int j){
        return i<j ? new int[]{i,j}: new int[]{j,i};
    }
}
