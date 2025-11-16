public interface FlyingVehicleInterface extends Vehicle {
    void switchToDriveMode();
    void switchToFlightMode();
    void driveForward(double speed);
    void applyBrakes();
    void takeOff();
    void land();
}
