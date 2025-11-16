public class FlyingCar implements LandVehicle, AirVehicle {
    private String name;
    private boolean isFlying = false;

    public FlyingCar(String name) {
        this.name = name;
    }

    // Tryb jazdy / lotu
    public void switchToDriveMode() {
        isFlying = false;
        System.out.println(name + " przełączony w tryb jazdy.");
    }

    public void switchToFlightMode() {
        isFlying = true;
        System.out.println(name + " przełączony w tryb lotu.");
    }

    // LandVehicle
    @Override
    public void driveForward(double speed) {
        if (!isFlying) {
            System.out.println(name + " jedzie po drodze z prędkością " + speed + " km/h.");
        } else {
            System.out.println(name + " nie może jechać w trybie lotu.");
        }
    }

    @Override
    public void applyBrakes() {
        System.out.println(name + " hamuje.");
    }

    // AirVehicle
    @Override
    public void takeOff() {
        if (!isFlying) {
            System.out.println(name + " startuje.");
        } else {
            System.out.println(name + " już jest w powietrzu.");
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            System.out.println(name + " ląduje.");
        } else {
            System.out.println(name + " jest już na ziemi.");
        }
    }
}
