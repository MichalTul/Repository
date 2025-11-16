public class Car implements Vehicle {
    private String name;
    private double speed;
    private double fuel;

    public Car(String name, double fuel) {
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

    public void driveForward(double speed) {
        this.speed = speed;
        System.out.println(name + " jedzie z prędkością " + speed + " km/h.");
    }

    public void applyBrakes() {
        speed = 0;
        System.out.println(name + " hamuje.");
    }
}
