package main.com.aca.homework.week3.numbers.maxMin;

public class Numbers {
    private int number1;
    private int number2;
    private int number3;

    public Numbers(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }


    public int max() {
        int[] array = new int[]{number1, number2, number3};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min() {
        int[] array = new int[]{number1, number2, number3};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
