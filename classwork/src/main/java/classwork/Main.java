package classwork;

public class Main {
    public static void main(String[] args) {
        testCourseClass();
    }

    public static void testCourseClass() {
        Course dataStructures = new Course("Date Structres", Course.Department.CNSE, Course.College.B, 306);
        System.out.println("Data Structures' Data (?): ");
        System.out.println("\t" + dataStructures.getName());
        System.out.println("\t" + dataStructures.getDepartment());
        System.out.println("\t" + dataStructures.getCollege());
        System.out.println("\t" + dataStructures.getNumber());

        dataStructures.setName("Intro to Data Structures");
        dataStructures.setDepartment(Course.Department.CMSC);
        dataStructures.setCollege(Course.College.H);
        dataStructures.setNumber(106);

        System.out.println("Data Structures' Data (Fixed): ");
        System.out.println("\tCode: " + dataStructures.code());
        System.out.println("\tFull Name: " + dataStructures);

    }
}
