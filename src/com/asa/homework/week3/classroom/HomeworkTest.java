package com.asa.homework.week3.classroom;

public class HomeworkTest {
    public static void main(String[] args) {

        AcaClass acaClass = new AcaClass();
        acaClass.name = "java level 1";
        acaClass.startMillis = 0;
        acaClass.endMillis = 13046400;
        acaClass.fee = 500000;


        Student student1 = new Student();
        student1.name = "Arman";
        student1.surname = "Vardanyan";
        Student student2 = new Student();
        student2.name = "Karen";
        student2.surname = "Hakobyan";
        Student student3 = new Student();
        student3.name = "Narek";
        student3.surname = "Martirosyan";
        Student student4 = new Student();
        student4.name = "Vahan";
        student4.surname = "Karapetyan";
        Student[] array = new Student[]{student1, student2, student3, student4};
        acaClass.student = array;


    }

}
