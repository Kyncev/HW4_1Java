package Employee;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;
    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public void showInfo() {
        System.out.println("ПІБ: " + fullName);
        System.out.println("Посада: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вік: " + age);
    }
}
