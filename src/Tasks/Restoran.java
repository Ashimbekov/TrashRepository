package Tasks;

public class Restoran {
    private static int sosugeCount = 0;
    private static int breadCount = 0;


    public static void addParty(){
        sosugeCount += 100;
        breadCount += 200;
        System.out.println("Прибыла новая партия");
        infoCount();
    }

    public static void infoCount(){
        System.out.println("Количество сосисок на складе: " + getSosugeCount());
        System.out.println("Количество хлеба на складе: " + getBreadCount());
        System.out.println("----------------------------------");
    }

    public static void order(){
        if (sosugeCount > 0 && breadCount > 1) {
            sosugeCount -= 1;
            breadCount -= 2;
        } else {
            System.out.println("Нет ингредиетов");
            System.out.println("Нужно заказать новую партию");
        }
    }

    public static int getSosugeCount() {
        return sosugeCount;
    }

    public static int getBreadCount() {
        return breadCount;
    }

    public static void setSosugeCount(int sosugeCount) {
        Restoran.sosugeCount = sosugeCount;
    }

    public static void setBreadCount(int breadCount) {
        Restoran.breadCount = breadCount;
    }

    public static void main(String[] args) {
        setSosugeCount(10);
        setBreadCount(20);
        infoCount();

        for (int i = 0; i < 10; i++){
            order();
        }

        sosugeCount = 100;
        infoCount();
//        addParty();



    }
}
