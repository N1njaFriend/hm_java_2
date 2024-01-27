public class Car extends Vehicle {
    private final int fuelCapacity;
    private int currentFuelCapacity;

    public Car(int id, String brand, String model, int yearOfRelease, int fuelCapacity, int currentFuelCapacity) {
        super(id, brand, model, yearOfRelease);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelCapacity = currentFuelCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель заглушен");
    }

    @Override
    public void accelerate(int speed) {
        System.out.printf("Автомобиль набрал скорость до %d\n", speed);
    }

    @Override
    public void stopMovement() {
        System.out.println("Автомобиль остановлен");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Автомобиль:\nID: %d\nМарка: %s\nМодель: %s\nГод выпуска: %d\nОбъем бензобака: %d л\n",
                id, brand, model, yearOfRelease, fuelCapacity);
    }

    public int getCurrentFuelCapacity() {
        return currentFuelCapacity;
    }

    public void refuel(int liters) {
        int newFuelLevel = currentFuelCapacity + liters;
        if (newFuelLevel <= fuelCapacity) {
            currentFuelCapacity = newFuelLevel;
        } else {
            int extraFuel = newFuelLevel - fuelCapacity;
            currentFuelCapacity = fuelCapacity;
            System.out.printf("Заправляемого топлива слишком много! Остался излишек %d л\n", extraFuel);
        }
    }
}