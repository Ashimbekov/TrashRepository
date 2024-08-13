package Tasks;


//Создайте подклассы Dog и Cat, которые наследуют Animal и реализуют метод makeSound().

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }
}

