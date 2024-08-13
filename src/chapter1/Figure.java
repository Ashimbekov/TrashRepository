package chapter1;

public class Figure {

    private String color;

    DayOfWeek a = DayOfWeek.MONDAY;

    void draw(){
        System.out.println("Drawing Figure");
        System.out.println(a);
    }

    void erase(){
        System.out.println("Erasing Figure");
    }

    void move(){
        System.out.println("Moving Figure");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}


class FigureDemo {
    public static void main(String[] args) {
        Figure f = new Figure();
        f.draw();
        f.erase();
        f.move();
        f.setColor("Red");
        System.out.println(f.getColor());
    }
}