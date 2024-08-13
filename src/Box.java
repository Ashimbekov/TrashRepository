class Box {
    double width;
    double height;
    double depth;

    Box (double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double area() {
        return width * height;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(2.0, 2.0, 2.0);
        Box box2 = new Box(3.0, 3.0, 3.0);

        System.out.println(box1.area());
        System.out.println(box1.volume() );
    }
}
