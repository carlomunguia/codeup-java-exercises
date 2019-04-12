package grades;

import util.Input;

import java.util.*;

public class GradesApplication {
    static Map<String,Student> students;

    public static void init() {
        students = new HashMap<>();
        Student dwight = new Student("Dwight");
        dwight.addGrade(90);
        dwight.addGrade(85);
        dwight.addGrade(400);

        Student bethany = new Student("Bethany");
        bethany.addGrade(95);
        bethany.addGrade(86);
        bethany.addGrade(100);

        Student marcus = new Student("Marcus");
        marcus.addGrade(117);
        marcus.addGrade(250);
        marcus.addGrade(30);

        Student adrien = new Student("Adrien");
        adrien.addGrade(43);
        adrien.addGrade(26);
        adrien.addGrade(0);
        adrien.addGrade(147000);

        students.put("dbmister", dwight);
        students.put("bethanyramirez", bethany);
        students.put("marcus100", marcus);
        students.put("adrienVL", adrien);

    }
    public static void welcome() {
        System.out.printf("Welcome!\n");
        String usernames = "|";
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.printf("\n" +
                "Here are the github usernames of our students:\n" +
                "\n" +
                usernames);
    }

    public static Map<String, Student> getStudents() {
        return students;
    }

    public static void setStudents(Map<String, Student> students) {
        GradesApplication.students = students;
    }

    public static void main(String[] args) {
        Input input;
        input = new Input();
        init();
        welcome();
        boolean keepGoing = true;

        do {
            System.out.println("What student are you trying to find?");
            String studentChoice = input.getString();
            System.out.println(studentChoice);




        }while

            @

    }
}