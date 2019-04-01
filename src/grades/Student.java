package grades;

import shapes.Square;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Student<i> {

    String[] stringarray;
    final ThreadLocal<List> stringCollection = new ThreadLocal<List<String>>();

    final AtomicReference<List> squares = new AtomicReference<List<Square>>();
    List<Shape> shapes;

    public Student() {
        stringCollection = new ArrayList<>();
    }


    stringArray[0] = "Hello"
        stringCollection.get(i)
        stringCollection.add("Hello")

    stringArray[i] = "Hello"
        stringCollection.add(i, "Hello");

        System.out.println(stringArray[3]);
        System.out.println(stringArray[3]);


}
