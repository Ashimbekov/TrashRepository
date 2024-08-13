package Tasks;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String toString(){
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}


class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", 30, "Male");
        Person p2 = new Person("Nuck Narman", 20, "Famale");

        System.out.println(p1.getName());
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        p1.setName("Sakura Harune");
        p1.setAge(22);
        p1.setGender("Female");

        System.out.println(p1.toString());
    }
}