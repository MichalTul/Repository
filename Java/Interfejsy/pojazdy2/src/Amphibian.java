public class Amphibian implements AmphibiousVehicleInterface {
    private String name;
    private boolean isOnLand = true;
    private double speed;
    private double fuel;

    public Amphibian(String name, double fuel) {
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
    public void switchToLandMode() {
        isOnLand = true;
        System.out.println(name + " w trybie lądowym.");
    }

    @Override
    public void switchToWaterMode() {
        isOnLand = false;
        System.out.println(name + " w trybie wodnym.");
    }

    @Override
    public void driveForward(double speed) {
        if (isOnLand) {
            this.speed = speed;
            System.out.println(name + " jedzie po lądzie z prędkością " + speed + " km/h.");
        } else {
            System.out.println(name + " nie może jechać po lądzie w trybie wodnym.");
        }
    }

    @Override
    public void applyBrakes() {
        speed = 0;
        System.out.println(name + " hamuje.");
    }

    @Override
    public void navigateOnWater(double headingDeg, double speed) {
        if (!isOnLand) {
            this.speed = speed;
            System.out.println(name + " porusza się po wodzie z prędkością " + speed + " km/h, kurs " + headingDeg + "°.");
        } else {
            System.out.println(name + " nie może pływać w trybie lądowym.");
        }
    }

    @Override
    public void anchor() {
        System.out.println(name + " opuszcza kotwicę.");
    }

    @Override
    public void removeAnchor() {
        System.out.println(name + " podnosi kotwicę.");
    }
}
