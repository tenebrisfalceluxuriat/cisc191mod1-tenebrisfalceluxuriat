package edu.sdccd.cisc191;

import static edu.sdccd.cisc191.StudentArrayToolkit.*;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */

public class Main {
    public static void main(String[] args) {
        // TODO: Create at least 6 students and demonstrate:
        Student[]students  = new Student[6];
        students[0] = new Student("A", 3.9, 101);
        students[1] = new Student("B", 3.2, 102);
        students[2] = new Student("C", 3.7, 103);
        students[3] = new Student("D", 2.9, 104);
        students[4] = new Student("E", 3.5, 105);
        students[5] = new Student("F", 4.0, 106);

        System.out.println("Original students:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("Sorted by GPA (desc):");
        Student[] sorted = copySortedByGpaDesc(students);
        for (Student s : sorted) {
            System.out.println(s);
        }
        System.out.println("Searching for ID 103:");
        Student found = findByIdLinear(students, 103);
        System.out.println(found);
        System.out.println("Top 3 students by GPA:");
        Student[] top3 = topNByGpa(students, 3);
        for (Student i : top3) {
            System.out.println(i);
        }
    }

}

