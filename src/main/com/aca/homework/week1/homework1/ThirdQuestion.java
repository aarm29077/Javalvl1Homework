package main.com.aca.homework.week1.homework1;

public class ThirdQuestion {
    public static void main(String[] args) {
        System.out.println("Please input number c 1-4. If you enter another number your result will be 0.");
        int action1 = action(597,89,2);
        System.out.println(action1);
    }

    public static int action(int a, int b, int c) {
        if (c == 1) {
            return a + b;
        } else if (c == 2) {
            if (b > a) {
                return b - a;
            } else {
                return a - b;

            }
        } else if (c == 3) {
            return b * a;
        } else if (c == 4) {
            if (b > a) {
                return b / a;
            } else {
                return a / b;
            }
        } else {
            return 0;
        }
    }

}
