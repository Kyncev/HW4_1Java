package app;
class Person {
    String name;
    int age;
    String work;
    Person(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }
    void changeWork(String newWork) {
        work = newWork;
    }
    void showInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + work + "\t");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vitalii", 26, "Актор");
        Person person2 = new Person("Andrey", 30, "Розробник");
        Person person3 = new Person("Bob", 42, "Лікар");
        person1.showInfo();
        person2.showInfo();
        person3.showInfo();
        System.out.println();
        Person person4 = new Person("Alice", 28, "Архітектор");
        person4.showInfo();
        person4.changeWork("Дизайнер");
        System.out.println("(Після оновлення професії)");
        person4.showInfo();
    }
}