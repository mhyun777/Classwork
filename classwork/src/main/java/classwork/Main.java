package classwork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testLinkedList();
        testLinkedList2();
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
        list.addEnd(10);
        list.addEnd(20);
        list.addEnd(40);
        list.add(30, 2);
        list.add(12345, 0);
        list.addFront(0);
        System.out.println(list);
        // 0 12345 10 20 30 40

        list.remove(1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        // 0 10 20 40
    }

    public static void testLinkedList2() {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list.addEnd(5);
        list.addEnd(7);
        list2.addEnd(5);
        System.out.print(list.toString()+" equals "+list2.toString()+": ");
        System.out.println(list.equals(list2));
        list2.addEnd(7);
        System.out.print(list.toString()+" equals "+list2.toString()+": ");
        System.out.println(list.equals(list2));

        LinkedList<Integer> list3 = list.copy();
        System.out.println(list3);
    }
}
