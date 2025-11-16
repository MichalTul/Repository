public class Airplane implements FlyingVehicleInterface {
    private String name;
    private boolean isFlying = false;
    private double speed;
    private double fuel;

    public Airplane(String name, double fuel) {
        this.name = name;
        this.fuel = fuel;
        this.speed = 0;
    }

    @Override
    public void start() {
        System.out.println(name + " uruchomiony.");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(name + " zatrzymany.");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getFuelLevel() {
        return fuel;
    }

    @Override
    public void switchToDriveMode() {
        isFlying = false;
        System.out.println(name + " w trybie jazdy.");
    }

    @Override
    public void switchToFlightMode() {
        isFlying = true;
        System.out.println(name + " w trybie lotu.");
    }

    @Override
    public void driveForward(double speed) {
        if (!isFlying) {
            this.speed = speed;
            System.out.println(name + " jedzie po pasie z prędkością " + speed + " km/h.");
        } else {
            System.out.println(name + " nie może jechać w powietrzu.");
        }
    }

    @Override
    public void applyBrakes() {
        speed = 0;
        System.out.println(name + " hamuje.");
    }

    @Override
    public void takeOff() {
        if (!isFlying) {
            isFlying = true;
            System.out.println(name + " startuje.");
        } else {
            System.out.println(name + " jest już w powietrzu.");
        }
    }

    @Override
    public void land() {
        if (isFlying) {
            isFlying = false;
            speed = 0;
            System.out.println(name + " ląduje.");
        } else {
            System.out.println(name + " już jest na ziemi.");
        }
    }
}
