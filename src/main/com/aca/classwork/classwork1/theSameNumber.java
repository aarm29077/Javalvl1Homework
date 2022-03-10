package com.aca.classwork.classwork1;

import java.util.Arrays;

public class theSameNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayChange(new int[]{12, 41, 2, 1445, 98, 21, 31})));
    }
        public static int[] arrayChange ( int[] arr){
            int[] result = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] / 10;
            }

            return result;
        }
}
