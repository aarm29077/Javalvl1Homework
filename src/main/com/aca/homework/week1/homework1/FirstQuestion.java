package main.com.aca.homework.week1.homework1;

public class FirstQuestion {
    public static void main(String[] args) {
    int max = max(25987,598,1455);
        System.out.println(max);
    }



    public static int max(int v1, int v2, int v3) {
        if (v1 > v2) {
            if (v1 > v3) {
                return v1;
            } else {
                return v3;
            }
        } else {
            if (v2 > v3) {
                return v2;
            } else {
                return v3;
            }
        }
    }
}
