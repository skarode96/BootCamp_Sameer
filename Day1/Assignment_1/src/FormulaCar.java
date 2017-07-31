

/**
 * Created by karodes on 7/13/2017.
 */
public class FormulaCar extends Car {
    public FormulaCar(String engineType, String steeringType, int numberOfWheels, int topSpeed, int noOfShifts, int acceleration, String carType) {
        super(engineType, steeringType, numberOfWheels, topSpeed, noOfShifts, acceleration, carType);
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 100;
        System.out.println("Accelerated with 100 km/s^2");
    }

    @Override
    public void brake() {
        this.speed = this.speed - 100;
        System.out.println("Braked suddenly");
    }

}
