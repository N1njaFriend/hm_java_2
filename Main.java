public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, "Porche", "911", 1970, 70, 25);
        Aircraft aircraft = new Aircraft(2, "Boing", "747", 2017, 10_000);
        Boat boat = new Boat(3, "Rusboat", "47", 2019, 50);

        car.displayInfo();
        System.out.println();
        car.startEngine();
        car.accelerate(60);
        System.out.println("До заправки: " + car.getCurrentFuelCapacity());
        car.refuel(15);
        System.out.println("После заправки: " + car.getCurrentFuelCapacity());
        car.stopMovement();
        car.stopEngine();
        System.out.println();

        aircraft.displayInfo();
        System.out.println();
        aircraft.startEngine();
        aircraft.accelerate(260);
        aircraft.takeoff();
        System.out.println("Статус полета: " + aircraft.isFlying());
        aircraft.land();
        System.out.println("Статус полета: " + aircraft.isFlying());
        aircraft.stopMovement();
        aircraft.stopEngine();
        System.out.println();

        boat.displayInfo();
        System.out.println();
        boat.startEngine();
        boat.startSwimming(40);
        System.out.println("Статус движения по воде: " + boat.isSwimming());
        boat.stopSwimming();
        System.out.println("Статус движения по воде: " + boat.isSwimming());
        boat.stopEngine();
    }
}