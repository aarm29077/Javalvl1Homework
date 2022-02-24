package main.exam.exam1;

import java.util.Scanner;

public class Exam {
    /*
    Ստեղծել ծրագիր, որը օգտագործողից կհարցնի 5 հատ թիվ, այնուհետ կախված օգտագործողի ընտրած թվից՝ կիրականացնի համապատասխան մշակում և կտպի արդյունք։
1 5 թվերից առավելագույնը
2 5 թվերից նվազագույնը
3 5 թվերից յուրաքանչյուրի արժեքի կրկնապատկում (այս քայլից հետո եթե օգտագործողը ընտրի օրինակ 1 մշակումը, ապա պետք է տեսնի նախկին առավելագույն արժեքի կրկնապատիկը)
4 5 թվերի միջինը
5 կպահանջի մուտքագրել N թիվ և կտպի N-րդ թիվը (եթե N֊ը ունի անթույլատրելի արժեք, ապա կանտեսի N-րդ թվի տպելը)
6 5 թվերից առավելագույնի և նվազագույնի տարբերությունը
7 բոլոր 5 թվերում 0֊ների քանակը
8 ծրագրի ավարտ
Ծրագիրը օգտագործողից պետք է անվերջ հարցնի մշակման համար՝ քանի դեռ ծրագրի ավարտ նշանակող 8 թիվը չի մուտքագրվել։
Ծրագիրը պետք  է գրել Exam class֊ում, բոլոր փոփոխականները պետք է լինեն private, իսկ ծրագրի աշխատանքը պետք է սկել ExamTest class-ից։
     */

    int[] numberArray = new int[5];

    public void putValues() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("Input numbers: ");
            numberArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    public int maxvalue() {
        int max = this.numberArray[0];
        for (int i = 1; i < this.numberArray.length; i++) {
            if (this.numberArray[i] > max) {
                max = numberArray[i];
            }
        }
        return max;

    }

    public int minValue() {
        int min = numberArray[0];
        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i] < min) {
                min = numberArray[i];
            }
        }
        return min;
    }

    public void valueDouble() {
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] *= 2;
        }
    }

    public double averageValue() {
        valueDouble();
        double sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        return sum / numberArray.length;
    }

    public void numberWanted() {
        valueDouble();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index");
        int index = scanner.nextInt();
        while (true) {
            if (index >= 1 && index <= 5) {
                System.out.println(numberArray[index - 1]);
                break;

            } else {
                System.out.println("Input index again: ");
                index = scanner.nextInt();
            }
        }
    }

    public int subtractionMaxAndMin() {
        valueDouble();
        int min = minValue();
        int max = maxvalue();

        return max - min;
    }

    public int zeroesCount() {
        valueDouble();
        int count = 0;

        for (int i = 0; i < numberArray.length; i++) {
            int arrayValue = numberArray[i];
            while (arrayValue > 0) {
                int k = arrayValue % 10;
                arrayValue = arrayValue / 10;
                if (k == 0) {
                    count += 1;
                }
            }
        }

        return count;

    }

}

