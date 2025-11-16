public class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    private String name;
    private boolean isOnLand = true;

    public AmphibiousVehicle(String name) {
        this.name = name;
    }

    public void switchToWaterMode() {
        isOnLand = false;
        System.out.println(name + " przełączony w tryb wodny.");
    }

    public void switchToLandMode() {
        isOnLand = true;
        System.out.println(name + " przełączony w tryb lądowy.");
    }

    @Override
    public void driveForward(double speed) {
        if (isOnLand) {
            System.out.println(name + " jedzie po lądzie z prędkością " + speed + " km/h.");
        } else {
            System.out.println(name + " nie może jechać po lądzie w trybie wodnym.");
        }
    }

    @Override
    public void applyBrakes() {
        System.out.println(name + " hamuje.");
    }

    @Override
    public void navigateOnWater(double headingDeg, double speed) {
        if (!isOnLand) {
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
