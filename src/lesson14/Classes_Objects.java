package lesson14;

public class Classes_Objects {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Dima";
        person.age = 18;
        System.out.println("Name: "+person.name + "; age: "+person.age);
        Person person1 = new Person();
        person1.name = "Oleg";
        person1.age = 19;
        System.out.println("Name: "+person1.name + "; age: "+person1.age);

    }
    static class Person{
        private String name;
        private int age;
    }
}
