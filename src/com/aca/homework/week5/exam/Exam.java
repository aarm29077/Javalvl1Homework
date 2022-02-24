package com.aca.homework.week5.exam;

/*
Create ExamTest class that has username and passed boolean flag. The only constructor should take username a passed fields.
Create PassedExamTest and FailedExamTest subclasses.
Implement toString method.
Create one failed exam test for username 'username1' and passed exam test for username 'smart-username'.
print the above mentioned methods using toString method.
 */
public class Exam {
    private String username;
    boolean passed;

    public Exam(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "username='" + username + '\'' +
                ", passed=" + passed +
                '}';
    }
}
