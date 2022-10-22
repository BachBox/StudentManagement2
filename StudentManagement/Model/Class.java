package StudentManagement.Model;

import java.util.*;

public class Class {
    private int cnt = 0;
    private List<Student> students = new ArrayList<>();



    public List<Student> getStudents() {
        return students;
    }

    public Class() {
    }



    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void inputStudents(Scanner sc, int n){
        while(cnt < n){
            System.out.println("Input name: ");
            String name = sc.nextLine();
            System.out.println("Input yob: ");
            int yob = Integer.parseInt(sc.nextLine());
            System.out.println("Input home town: ");
            String home = sc.nextLine();
            System.out.println("Input class: ");
            String oclass = sc.nextLine();
            System.out.println("Input semester: ");
            int semester = Integer.parseInt(sc.nextLine());
            students.add(new Student(name, yob, home, oclass, semester));
            cnt++;
        }
    }

    public void printStudents(){
        for (Student student : students) {
            System.out.println(student);
            System.out.println("\n");
        }
    }

    public void printSpecialStudents(int yob, String home){
        for (int i = 0; i < students.size(); i++) 
            if(students.get(i).getYob() == yob && students.get(i).getHome().equalsIgnoreCase(home))
                System.out.println(students.get(i));
    }

    public void printStudentsInAClass(String classs){
        for (int i = 0; i < students.size(); i++) 
            if(students.get(i).getOclass().equalsIgnoreCase(classs))
                System.out.println(students.get(i));
    }

    
}
