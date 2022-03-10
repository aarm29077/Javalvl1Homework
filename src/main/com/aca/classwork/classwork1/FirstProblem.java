package com.aca.classwork.classwork1;

public class FirstProblem {
    public static void main(String[] args) {
        //eranish tvi masnikneri anjatum anjatum

        int i=974;
//        int n1=i/10;
//        int n2=i-n1*10;
        int a=first(i);
        int b=second(i);
        int c=third(i);
        System.out.println( a+" + " + b + " + " +  c + " = " + i);
        long max=max(c,max(a,b));
        long min=min(c,min(a,b));
        System.out.println(max-min);

    }
    public static int first(int i){
        return i/100;

    }
    public static int second(int i){
        return (i - (first(i) * 100))/10;
    }
    public  static  int third(int i){
        return i-100*first(i)- 10 *second(i);
//        return (i - (first(i) * 100)) - (((i - (first(i) * 100))/10)*10);
    }
    public static long max(long a, long b) {
        return a > b ? a : b;
    }
    public static long min(long a , long b){
        return a<b ? a:b ;
    }

}
