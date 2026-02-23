package com.hannacares;

import com.hannacares.first.Student;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        s.Intro();

        List<Student> students = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File("data/student.csv"));

            // ✅ SKIP CSV HEADER
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine()) {

                String line = sc.nextLine().trim();

                if (line.isEmpty())
                    continue;

                String[] data = line.split(",");

                String name = data[0].trim();
                String course = data[1].trim();
                int age = Integer.parseInt(data[2].trim());

                students.add(new Student(name, course, age));
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("\nStudents Loaded:");
        for (Student st : students) {
            System.out.println(st);
        }
    }
}