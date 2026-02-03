package classwork;

public class Course {
    private String name;
    public enum Department {CMSC, CNSE};
    private Department department;
    public enum College {H, B, S};
    private College college;
    private int number;

    public Course(String name, Department department, College college, int number) {
        this.name = name;
        this.department = department;
        this.college = college;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return this.department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public College getCollege() {
        return this.college;
    }
    public void setCollege(College college) {
        this.college = college;
    }

    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gives the code for a course, which looks like "DEPT H123"
     * @return The course code
     */
    public String code() {
        return department.toString() + " " + college.toString() + Integer.toString(number);
    }

    @Override
    public String toString() {
        return code() + " " + name;
    }
}
