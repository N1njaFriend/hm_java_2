public class Boat extends Vehicle implements Swimmable {
    private final int maxSpeedInWater;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int yearOfRelease, int maxSpeedInWater) {
        super(id, brand, model, yearOfRelease);
        this.maxSpeedInWater = maxSpeedInWater;
        this.isSailing = false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель лодки запущен");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель лодки заглушен");
    }

    @Override
    public void accelerate(int speed) {
        if (speed <= maxSpeedInWater) {
            System.out.printf("Лодка набрала скорость %d\n", speed);
        } else {
            System.out.printf("Скорость, которую нужно набрать, слишком высока! Максимальная скорость составляет %d км/ч\n",
                    maxSpeedInWater);
        }
    }

    @Override
    public void stopMovement() {
        System.out.println("Лодка остановлена");
    }

    @Override
    public void displayInfo() {
        System.out.printf("Лодка:\nID: %d\nМарка: %s\nМодель: %s\nГод выпуска: %d\nМаксимальная скорость: %d км/ч\n",
                id, brand, model, yearOfRelease, maxSpeedInWater);
    }

    @Override
    public void startSwimming(int speed) {
        if (!isSailing) {
            isSailing = true;
            accelerate(speed);
        } else {
            System.out.println("Лодка уже плывет");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSailing) {
            isSailing = false;
            stopMovement();
        } else {
            System.out.println("Лодка уже не плывет");
        }
    }

    @Override
    public boolean isSwimming() {
    return isSailing;
    }
}