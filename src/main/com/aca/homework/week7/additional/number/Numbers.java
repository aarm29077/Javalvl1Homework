package com.aca.homework.week7.additional.number;

public class Numbers {
    public static void sortingArray(int[] array) {
        int k;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    k = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = k;
                }
            }
        }
    }

    public static int findNumber(int[] firstArray, int[] secondArray) {
        sortingArray(firstArray);
        sortingArray(secondArray);

        for (int i = 0; i < secondArray.length; i++) {
            if (firstArray[i] - secondArray[i] != 0) {
                return firstArray[i];
            }
        }
        return firstArray[firstArray.length - 1];
    }


}
