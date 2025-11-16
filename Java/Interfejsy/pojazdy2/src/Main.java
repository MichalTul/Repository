public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 50);
        Amphibian amphibian = new Amphibian("AmphiX", 80);
        Airplane airplane = new Airplane("Boeing", 200);

        System.out.println("=== Car ===");
        car.start();
        car.driveForward(60);
        car.applyBrakes();
        car.stop();

        System.out.println("\n=== Amphibian ===");
        amphibian.start();
        amphibian.switchToWaterMode();
        amphibian.navigateOnWater(45, 25);
        amphibian.anchor();
        amphibian.switchToLandMode();
        amphibian.driveForward(50);
        amphibian.stop();

        System.out.println("\n=== Airplane ===");
        airplane.start();
        airplane.switchToFlightMode();
        airplane.takeOff();
        airplane.driveForward(200); // nie może jechać
        airplane.land();
        airplane.switchToDriveMode();
        airplane.driveForward(20);
        airplane.stop();
    }
}
