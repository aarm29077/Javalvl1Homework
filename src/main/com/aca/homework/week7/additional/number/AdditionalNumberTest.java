package com.aca.homework.week7.additional.number;


class AdditionalNumberTest {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] secondArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Numbers.findNumber(firstArray, secondArray));
    }

}