package com.aca.classwork.classwork2;
import java.util.Scanner;
public class StringTest {
    public static void main(String[] args) {
//        4
//        tver mutqagrel lcnel zangvaci mej, heto tpel tvi indexy
//        orinak 1, 2, 75, 75i indexy tpi 2



//       1
        String s = "1|2|3|4|5|6";
        String s1 = "";
        String string;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '|') {
                System.out.println(s.charAt(i));
                s1 += s.charAt(i);

            }
            System.out.println(s1);
//        int length = s.length();
//        System.out.println("The length is: " + length);
//        char[] chars =  s.toCharArray();



//            2
            char[] array1 = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            string = scanner.next();

            System.out.println(indexOfString(string));
//            char string1 = string.charAt(0);
//            for (int i = 0; i < array1.length; i++) {
//                if (string1 == array1[i]) {
//                    System.out.println(string1);
//                }
//            }
        }
    }
        public static int indexOfString (String string){
            char chars[] = new char[]{'a', 'b', 'c', 'd', 'e'};
            final char firstChar = string.charAt(0);
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]==firstChar){
                    return i;
                }
            }
            return -1;
        }

    }

