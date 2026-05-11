package Car;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль запущено");
    }
    private void startElectricity() {
        System.out.println("Електрика увімкнена");
    }
    private void startCommand() {
        System.out.println("Команда запуску отримана");
    }
    private void startFuelSystem() {
        System.out.println("Паливна система активована");
    }
}