package Tasks;

public class PracticeCar {
    public static void main(String[] args) {
        CarFa car1 = new CarFa("SuperCar", 400);
        CarFa car2 = new CarFa("ZworykinCar");


        Garage garage = new Garage();
        garage.setCar1(car1);
        garage.setCar2(car2);
        garage.getInfoAboutCars();


    }
}
