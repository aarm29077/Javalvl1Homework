package homework;
/*
Classwork2
 */
public class SecondQuestion {
    public static void main(String[] args){
        long min = min(56,89);
        long t1= 5556;
        long t2= 644;
        long t3 = 74;
        if (t1<min){
            min = t1;
        }
        if (t2< min){
            min = t2;
        }
        if(t3<min){
            min = t3;
        }
        System.out.println(min);
    }


    public static long min(long num1 , long num2){

        if (num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
}