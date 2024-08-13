package operators;

import java.util.*;
//import static net.mindview.util.Print.*;

public class HelloDate {
    public static void main(String[] args) {
        Dog dg1 = new Dog();
        Dog dg2 = new Dog();
        Dog dg3 = new Dog();

        dg1.name = "Spot";
        dg2.name = "Scruffy";
        dg3.name = "Spot";

        if (dg1.equals(dg3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}


class Dog {
    String name;
    String says;
}