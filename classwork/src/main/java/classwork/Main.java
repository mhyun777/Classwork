package classwork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // testCourseClass();
        // testCSCourseClass();
        // testArrays();
        // holders();
        // testExceptions();
        testLinkedList();
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
        String[] myStrings = {"this", "is", "an", "array", "ofstrings"};

        String[] moreStrings = new String[6];
        for(int i = 0; i < myStrings.length; i++) {
            moreStrings[i] = myStrings[i];
        }
        moreStrings[4] = "of";
        moreStrings[5] = "strings";

        printArray(myStrings);
        System.out.println();
        printArray(moreStrings);
        System.out.println();

        ArrayList<String> myStringList = new ArrayList<>();
        for(int i = 0; i < myStrings.length; i++) {
            myStringList.add(myStrings[i]);
        }
        System.out.println(myStringList);
        myStringList.remove(2);
        myStringList.remove("ofstrings");
        myStringList.remove("not there");
        myStringList.add(2, "great");
        myStringList.add(2, "a");
        myStringList.set(4, "ArrayList");
        System.out.println(myStringList);
    }

    public static void printArray(String[] arr) {
        for(String e: arr) {
            System.out.println(e);
        }
    }

    public static void holders() {
        Holder<String, Integer, Double> h = new Holder<>("a", 1, 2.5);
        System.out.println(h);
    }

    public static void testExceptions() {
        try {
            CharlesBrown.kickTheFootball();
        } catch(MissedException e) {
            e.printStackTrace();
        }
    }

    public static void testLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(10);
        list.push(20);
        list.push(40);
        list.add(2, 30);
        list.add(2, 12345);
        list.remove(2);
        list.pop();
        System.out.println(list);
    }
}
