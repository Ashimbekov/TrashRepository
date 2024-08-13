package Tasks;

//public class Car extends Vehicle{
//
//    public Car(String make, String model) {
//        super(make, model);
//    }
//
//    @Override
//    public void drive(){
//        System.out.println("Car is driving");
//    }
//
//    public static void main(String[] args) {
//        Car car = new Car("Toyota", "Camry");
//        System.out.println(car);
//        car.drive();
//    }
//}

public class Car {
    private String make;
    private String model;
    private Engine engine;


    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Engine Started");
    }

    @Override
    public String toString() {
        return "Car2{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
//        Engine engine1 = new Engine("V3.5", 200);
        Car car = new Car("Toyota", "Camry", new Engine("V8", 300));
        System.out.println(car);
        car.startEngine();

    }


}