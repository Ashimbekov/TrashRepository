package Tasks;

public class Garage {
    private CarFa car1;
    private CarFa car2;

    public Garage() {
    }

    public CarFa getCar1() {
        return car1;
    }

    public void setCar1(CarFa car1) {
        this.car1 = car1;
    }

    public CarFa getCar2() {
        return car2;
    }

    public void setCar2(CarFa car2) {
        this.car2 = car2;
    }

    public void getInfoAboutCars() {
        getInfoAboutCar(car1);
        getInfoAboutCar(car2);
    }

    private void getInfoAboutCar(CarFa car){
        System.out.println(car.getBrand());
        car.overclockOf100();
    }

    //    public Garage(int maxCapacity, int capacity, CarFa car) {
//        this.maxCapacity = maxCapacity;
//        this.capacity = capacity;
//        this.car = car;
//    }

//    public Garage(int maxCapacity, int capacity) {
//        this.maxCapacity = maxCapacity;
//        this.capacity = capacity;
//    }
//
//    public Garage(){
//        this(2, 0);
//    }
//
//    public int getMaxCapacity() {
//        return maxCapacity;
//    }
//
//    public void setMaxCapacity(int maxCapacity) {
//        this.maxCapacity = maxCapacity;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public CarFa getCar2() {
//        return car2;
//    }
//
//    public void setCar2(CarFa car2) {
//        this.car2 = car2;
//    }
//
//    public CarFa getCar1() {
//        return car1;
//    }
//
//    public void setCar1(CarFa car1) {
//        this.car1 = car1;
//    }
//
//    @Override
//    public String toString() {
//        return "Garage{" +
//                "maxCapacity=" + maxCapacity +
//                ", capacity=" + capacity +
//                ", car1=" + car1 +
//                ", car2=" + car2 +
//                '}';
//    }
}
