package classwork;

public class Main {
    public static void main(String[] args) {
        testCourseClass();
    }

    public static void testCourseClass() {
        Course dataStructures = new Course("Intro to Data Structures", Course.Department.CMSC, Course.College.H, 106);
        System.out.println("Data structures's code is: ");
        System.out.println(dataStructures.code());
        System.out.println("and its full name is: ");
        System.out.println(dataStructures);
    }
}
