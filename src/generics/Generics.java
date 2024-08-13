package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
//        Example<String> example = new Example<>();
//        System.out.println(example.getStr());
//        example.addToStr("1");
//        example.addToStr("2");
////        example.addToStr(3);
////        example.addToStr(4);
////        example.addToStr(Integer.valueOf("1"));
//        System.out.println(example.getStr());

        Example<Car, String> carExample = new Example<>();
        String vStr = " Rest";

        Car car1 = new Car("Toyota", 2024);
        Car car2 = new Car("Lexus", 2023);
        Car car3 = new Car("Audi", 2025);

        carExample.addToStr(car1, vStr);
        carExample.addToStr(car2, vStr);
        carExample.addToStr(car3, vStr);
        System.out.println(carExample.getStr());

        List<String> list = new ArrayList<>();


    }
}
