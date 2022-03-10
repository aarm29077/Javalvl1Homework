package main.com.aca.homework.week5.programmer.level;

/*
Create a ProgrammerLevel enum class that has 2 constants: JUNIOR, MID, SENIOR.
Implement the toString method to return "Junior programmer", "Mid programmer" and "Senior programmer" for JUNIOR, MID, SENIOR constants respectively.
 */
public enum ProgrammerLevel {
    Junior,
    Mid,
    Senior;

    @Override
    public String toString() {
        if (this == Junior) {
            return  "Junior programmer";
        } else if (this == Mid) {
            return Mid + "Mid programmer";
        }
        return "Senior programmer";
    }

    public static void main(String[] args) {
        System.out.println(ProgrammerLevel.Junior);
    }
}
