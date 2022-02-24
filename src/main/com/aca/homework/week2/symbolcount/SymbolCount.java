package main.com.aca.homework.week2.symbolcount;

import java.util.Scanner;

public class SymbolCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String word =  scanner.nextLine();
        System.out.print("Please write a symbol: ");
        String letter = scanner.nextLine();
        int sum=0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==letter.charAt(0)){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
