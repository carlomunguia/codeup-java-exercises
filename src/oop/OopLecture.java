package oop;

public class OopLecture {
    public static void main(String[] args) {

        Person p = new Person();
        Person p2 = new Person();

        p.firstName = "Justin";
        p.lastName = "Reich";

        System.out.printf("%s %s", p.firstName, p.lastName);
    }
}
