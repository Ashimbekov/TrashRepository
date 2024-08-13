package chapter1;

public class Person implements Info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

//    @Override
    public void showInfo() {
        System.out.println("Info: " + name);
    }
}

class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person("John");
        p.sayHello();
        p.showInfo();

        Info info1 = new Person("Nurdaulet");
        info1.showInfo();
    }
}