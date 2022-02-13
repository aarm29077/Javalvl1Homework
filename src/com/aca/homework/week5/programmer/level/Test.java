package com.aca.homework.week5.programmer.level;

/*
Create a ProgrammerLevel enum class that has 2 constants: JUNIOR, MID, SENIOR.
Implement the toString method to return "Junior programmer", "Mid programmer" and "Senior programmer" for JUNIOR, MID, SENIOR constants respectively.
 */
public class Test {
    ProgrammerLevel programmerLevel;

    Test(ProgrammerLevel programmerLevel) {
        this.programmerLevel = programmerLevel;
    }

    @Override
    public String toString() {
        return programmerLevel + " programming";
    }

    public static void main(String[] args) {
        Test test = new Test(ProgrammerLevel.Senior);
        System.out.println(test);
    }
}
