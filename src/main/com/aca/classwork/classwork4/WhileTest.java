package com.aca.classwork.classwork4;

public class WhileTest {
    public static void main(String[] args) {
        final long startMillis = System.currentTimeMillis();

        long secondsThatIPrinted= 0;

        while (true){

            long currentMillis = System.currentTimeMillis();

            long secondsThatIWantToPrint = (currentMillis-startMillis) / 1000;

            if (secondsThatIPrinted != secondsThatIWantToPrint){
                System.out.println(secondsThatIWantToPrint);
                secondsThatIPrinted=secondsThatIWantToPrint;
            }
        }
    }
}
