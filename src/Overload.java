class Overload {
    void test(){
        System.out.println("Параметры отсуствуют");
    }

    void test(int a){
        System.out.println("a: " + a);
    }

    void test(int a, int b){
        System.out.println("a: " + a + ", b: " + b);
    }

    double test(double a){
        return a*a;
    }
}

class Overload2 {
    void test(){
        System.out.println("Параметры отсуствуют");
    }

    void test(int a, int b){
        System.out.println("a: " + a + ", b: " + b);
    }

    void test(double a){
        System.out.println("a: " + a);
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println(result);
    }
}

class OverloadDemo2 {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.25);
    }
}