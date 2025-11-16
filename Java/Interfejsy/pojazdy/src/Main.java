public class Main {
    public static void main(String[] args) {
        AmphibiousVehicle amphCar = new AmphibiousVehicle("AmphiX");
        FlyingCar flyingCar = new FlyingCar("SkyDrive");

        System.out.println("AmphibiousVehicle");
        amphCar.driveForward(50);
        amphCar.switchToWaterMode();
        amphCar.navigateOnWater(90, 20);
        amphCar.anchor();
        amphCar.removeAnchor();
        amphCar.switchToLandMode();
        amphCar.driveForward(60);
        amphCar.applyBrakes();

        System.out.println();
        System.out.println("FlyingCar");
        flyingCar.driveForward(80);
        flyingCar.switchToFlightMode();
        flyingCar.takeOff();
        flyingCar.driveForward(100);
        flyingCar.land();
        flyingCar.switchToDriveMode();
        flyingCar.driveForward(70);
    }
}
