package classwork;

public class Course {
    public String name;
    public enum Department {CMSC,};
    public Department department;
    public enum College {H, B, S};
    public College college;
    public int number;

    public Course(String name, Department department, College college, int number) {
        this.name = name;
        this.department = department;
        this.college = college;
        this.number = number;
    }

    /**
     * Gives the code for a course, which looks like "DEPT H123"
     * @return The course code
     */
    public String code() {
        String output = "";
        switch (department) {
            case CMSC: {
                output += "CMSC ";
                break;
            }
            default: {
                output += "???? ";
                break;
            }
        }
        switch (college) {
            case H: {
                output += "H";
                break;
            }
            case B: {
                output += "B";
                break;
            }
            case S: {
                output += "S";
                break;
            }
        }
        return output + Integer.toString(number);
    }

    public String toString() {
        return code() + " " + name;
    }
}
