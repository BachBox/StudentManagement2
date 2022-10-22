package StudentManagement.Model;

public class Student {
    private String name;
    private int yob;
    private String home;
    private String oclass;
    private int semester;

    public Student(String name, int yob, String home, String oclass, int semester) {
        this.name = name;
        this.yob = yob;
        this.home = home;
        this.oclass = oclass;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOclass() {
        return oclass;
    }

    public void setOclass(String oclass) {
        this.oclass = oclass;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", yob=" + yob + ", home=" + home + ", oclass=" + oclass + ", semester="
                + semester + "]";
    }

    
    
    
}
