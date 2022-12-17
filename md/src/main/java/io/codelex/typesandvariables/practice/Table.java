package io.codelex.typesandvariables.practice;

public class Table {
    public static void main(String[] args) {
        String line = "+" + "-".repeat(50) + "+";
        String course1 = "English III", course2 = "Precalculus", course3 = "Music Theory", course4 = "Biotechnology",
                course5 = "Principles of Technology I", course6 = "Latin II", course7 = "AP US History", course8 = "Business Systems", courses = "";
        String teacher1 = "Ms. Lapan", teacher2 = "Mrs. Gideon", teacher3 = "Mr. Davis", teacher4 = "Ms. Palmer",
                teacher5 = "Ms. Garcia", teacher6 = "Mrs. Barnett", teacher7 = "Ms. Johannessen", teacher8 = "Mr. James", teachers = "";
        System.out.println(line);

        for (int i = 1; i < 9; i++) {
            switch (i) {
                case 1 -> {
                    courses = " ".repeat(27 - course1.length()) + course1;
                    teachers = " ".repeat(16 - teacher1.length()) + teacher1;
                }
                case 2 -> {
                    courses = " ".repeat(27 - course2.length()) + course2;
                    teachers = " ".repeat(16 - teacher2.length()) + teacher2;
                }
                case 3 -> {
                    courses = " ".repeat(27 - course3.length()) + course3;
                    teachers = " ".repeat(16 - teacher3.length()) + teacher3;
                }
                case 4 -> {
                    courses = " ".repeat(27 - course4.length()) + course4;
                    teachers = " ".repeat(16 - teacher4.length()) + teacher4;
                }
                case 5 -> {
                    courses = " ".repeat(27 - course5.length()) + course5;
                    teachers = " ".repeat(16 - teacher5.length()) + teacher5;
                }
                case 6 -> {
                    courses = " ".repeat(27 - course6.length()) + course6;
                    teachers = " ".repeat(16 - teacher6.length()) + teacher6;
                }
                case 7 -> {
                    courses = " ".repeat(27 - course7.length()) + course7;
                    teachers = " ".repeat(16 - teacher7.length()) + teacher7;
                }
                case 8 -> {
                    courses = " ".repeat(27 - course8.length()) + course8;
                    teachers = " ".repeat(16 - teacher8.length()) + teacher8;
                }
            }
            System.out.println("| " + i + " |" + courses + " |" + teachers + " |");
        }
        System.out.println(line);
    }
}
