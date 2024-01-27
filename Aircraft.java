public class Aircraft extends Vehicle implements Flyable {
    private final int maxAltitude;
    private boolean isFlying;

    public Aircraft(int id, String brand, String model, int yearOfRelease, int maxAltitude) {
        super(id, brand, model, yearOfRelease);
        this.maxAltitude = maxAltitude;
        this.isFlying = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель самолета заглушен");
    }

    @Override
    public void accelerate(int speed) {
        System.out.printf("Самолет набрал скорость до %d\n", speed);
    }

    @Override
    public void stopMovement() {
        System.out.println("Самолет остановлен");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Самолет:\nID: %d\nМарка: %s\nМодель: %s\nГод выпуска: %d\nМаксимальная высота полета: %d м\n",
                id, brand, model, yearOfRelease, maxAltitude);
    }

    @Override
    public void takeoff() {
        if (!isFlying) {
            isFlying = true;
            System.out.println("Самолет взлетает...");
        } else {
            System.out.println("Самолет уже в полете");
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            isFlying = false;
            System.out.println("Самолет снижается и совершает посадку");
        } else {
            System.out.println("Самолет уже на земле");
        }
    }

    @Override
    public boolean isFlying() {
    return isFlying;
    }
}