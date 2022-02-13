package com.asa.homework.week2.projectuptime;

import java.util.Scanner;

public class ProjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Project[] projects = new Project[3];
        createProject(projects);
        System.out.println(projects[0].creationSeconds+" " + projects[0].name);
        System.out.println(projects[1].creationSeconds+" " + projects[1].name);
        System.out.println(projects[2].creationSeconds+" " + projects[2].name);
    }

    public static void createProject(Project[] projects) {
        Scanner scanner = new Scanner(System.in);
        long startSecond=System.currentTimeMillis();
        for (int i = 0; i < projects.length; i++) {
            Project project = new Project();
            System.out.print("Input name: ");
            project.name=scanner.nextLine();
            project.creationSeconds= (System.currentTimeMillis()-startSecond)/1000;
            projects[i]=project;
        }

    }


    }

