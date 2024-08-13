package Tasks;

public class CarFa {
    private String brand;
    private int maxSpeed = 220;

    public CarFa(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public CarFa(String brand){
        this.brand = brand;
    }

    public void overclockOf100(){
        double speed = 110d / (this.maxSpeed / 20d);
//       System.out.println("Скорость разгона до 100км/ч " + speed);
        System.out.printf("Скорость разгона до 100км/ч : %s\n", speed);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "CarFa {" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }


}
