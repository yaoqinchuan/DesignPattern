public class ElectricAdapter implements Motor {

    ElectricMotor electricMotor = new ElectricMotor();

    @Override
    public void driver() {
        electricMotor.electricDrive();
    }
}
