package StudentManagement.View;

import java.util.Scanner;

import StudentManagement.Model.Class;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Class classes = new Class();
        System.out.println("How many student u wanna input: ");
        int n = Integer.parseInt(sc.nextLine());
        classes.inputStudents(sc, n);
        classes.printStudents();
        System.out.println("---------------------");
        classes.printSpecialStudents(1985, "thai nguyen");
        System.out.println("--------------------");
        classes.printStudentsInAClass("10s1");

    }
}
