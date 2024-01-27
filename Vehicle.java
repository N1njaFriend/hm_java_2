public abstract class Vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected int yearOfRelease;

    public Vehicle(int id, String brand, String model, int yearOfRelease) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public abstract void accelerate(int speed);

    public abstract void stopMovement();

    public abstract void displayInfo();
}