package com.aca.classwork.classwork8.developer;

public class HR {

    public static void main(String[] args) {

        Developer juniorDeveloper = new JuniorDeveloper("Narek", 300_00);
        Developer juniorDeveloper1 = new JuniorDeveloper("Hayk", 350_000);
        Developer juniorDeveloper2 = new JuniorDeveloper("Tiko", 620_000);


        Developer midDeveloper = new MidDeveloper("Artash");
        Developer midDeveloper1 = new MidDeveloper("Hrach");

        Developer[] array = {juniorDeveloper, juniorDeveloper1, juniorDeveloper2, midDeveloper, midDeveloper1};
        System.out.println(calculate(array));
        Printers.printAllToStrings(array);

        JuniorDeveloper juniorDeveloper3 = new JuniorDeveloper("Vrej", 69000);
        printSalary(juniorDeveloper3);

    }

    public static void printSalary(Developer developer) {
        System.out.println(developer.getSalary());
    }

    public static long calculate(Developer[] developers) {
        long sum = 0;
        for (int i = 0; i < developers.length; i++) {
            sum += developers[i].getSalary();
        }
        return sum;
    }

//    public static long calculate(JuniorDeveloper[] juniorDevelopers){
//        long sum=0;
//        for (int i = 0; i < juniorDevelopers.length; i++) {
//            sum+=juniorDevelopers[i].getSalary();
//        }
//        return sum;
//    }
//    public static long calculate(MidDeveloper[] midDevelopers){
//        long sum=0;
//        for (int i = 0; i < midDevelopers.length; i++) {
//            sum+=midDevelopers[i].getSalary();
//        }
//        return sum;
//    }

//    public static void printAllToStrings(Object[] developers){
//        for (int i = 0; i < developers.length; i++) {
//            System.out.println(developers[i].toString());
//        }
//    }

}
