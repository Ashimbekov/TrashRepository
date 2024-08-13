package Collections;

import java.util.List;
import java.util.function.Predicate;

public class Fruits {


    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "orange", "pineapple", "grapefruit", "melon");

        Predicate<String> isEqualsOrange = Predicate.isEqual("orange");
        Predicate<String> isEqualsGrapefruit = Predicate.isEqual("grapefruit");
        Predicate<String> isEqualsCitrus = isEqualsOrange.or(isEqualsGrapefruit);
        Predicate<String> isNotEqualsCitrue = isEqualsCitrus.negate();

//        fruits.stream().filter(isEqualsOrange).forEach(System.out::println);
        // orange

//        fruits.stream().filter(isEqualsCitrus).forEach(System.out::println);

//        fruits.stream().filter(isNotEqualsCitrue).forEach(System.out::println);

    }


}
