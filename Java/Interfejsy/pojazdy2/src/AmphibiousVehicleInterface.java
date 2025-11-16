public interface AmphibiousVehicleInterface extends Vehicle {
    void switchToLandMode();
    void switchToWaterMode();
    void driveForward(double speed);
    void applyBrakes();
    void navigateOnWater(double headingDeg, double speed);
    void anchor();
    void removeAnchor();
}
