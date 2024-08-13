package operators;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(2);

        if (result == 0) System.out.println("Решка");
        else System.out.println("Орел");
    }
}
