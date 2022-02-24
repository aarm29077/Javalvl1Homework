package main.com.aca.homework.week4.developer;

/*
Do not use a constructor other than a default in the above-mentioned classes.
Create a print method to print the details of the class.
Create a developer named Gerard and print it (the print text should be "name: Gerard, salary: 60000, learning budget: 300")
Create a junior developer named Maricar and print it. (the print text should be "name: Maricar, salary: 300000, learning budget: 600")
Create a senior developer named Emily and print it. (the print text should be "name: Emily, salary: 3000000, learning budget: 2400")
note: The Developer class should have only one name field. The JuniorFeveloper and the SeniorDeveloper should not have any field.
 */
public class Test {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("Gerard");
        developer.print();

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.setName("Maricar");
        juniorDeveloper.print();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.setName("Emily");
        seniorDeveloper.print();
    }
}
