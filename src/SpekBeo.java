public class SpekBeo {
    public static void main(String[] args) {
        Person person_1 = new Person();
        person_1.name = "Роман";
        person_1.age = 34;
        person_1.speak();

        Person person_2 = new Person();
        person_2.name = "Иван";
        person_2.age = 52;
        person_2.speak();
    }
}

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}
