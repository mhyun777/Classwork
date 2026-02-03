package classwork;

public class Main {
    public static void main(String[] args) {
        testCourseClass();
        System.out.println();
        testCSCourseClass();
        System.out.println();
        testArrays();
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

    public static void testCSCourseClass() {
        CSCourse.Language[] dSLanguages = {CSCourse.Language.JAVA};
        CSCourse dataStructures = new CSCourse("Intro to Data Structures", Course.College.H, 106, dSLanguages);
        System.out.println(dataStructures);

        CSCourse.Language[] languages = {CSCourse.Language.PYTHON, CSCourse.Language.C, CSCourse.Language.JAVA};
        CSCourse anotherCourse = new CSCourse("All the CS!!!", Course.College.B, 499, languages);
        System.out.println(anotherCourse);
    }

    public static void testArrays() {
        String[] myStrings = new String[5];
        myStrings[0] = "this";
        myStrings[1] = "is";
        myStrings[2] = "an";
        myStrings[3] = "array";
        myStrings[4] = "ofstrings";

        String[] moreStrings = new String[6];
        for(int i = 0; i < myStrings.length; i++) {
            moreStrings[i] = myStrings[i];
        }
        moreStrings[4] = "of";
        moreStrings[5] = "strings";

        printArray(myStrings);
        System.out.println();
        printArray(moreStrings);
    }

    public static void printArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}