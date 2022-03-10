package com.aca.classwork.classwork1;

public class FifthProblem {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println(i);
        }
        printArray(new int []{4,5});
        System.out.println(sum(new int []{1,23,4,4,41,12}));

        System.out.println(sum(new int[]{2,3,2,5,3,2,1,4,5,9,7}));


//        final int size = 1000;
//        int array[] = new int[size];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
}


    public static int sum(int[] array1) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {

            sum += array1[i];
        }
        return sum;
    }



    public static void printArray(int[] array3){
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i] + " = " + array3[i]);
        }
    }

}