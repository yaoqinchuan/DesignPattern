public class OpticalAdapter implements Motor {
    OpticalMotor opticalMotor = new OpticalMotor();

    @Override
    public void driver() {
        opticalMotor.opticalDrive();
    }

    public static void main(String[] args) {
        Motor opticalMotor = new OpticalAdapter();
        opticalMotor.driver();
    }
}
