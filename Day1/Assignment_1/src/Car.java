/**
 * Created by karodes on 7/13/2017.
 */
public class Car extends Automobile {

    String carType;

    public Car() {

    }

    public Car(String engineType, String steeringType, int numberOfWheels, int topSpeed, int noOfShifts, int acceleration, String carType) {
        super(engineType, steeringType, numberOfWheels, topSpeed, noOfShifts, acceleration);
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void display() {
        System.out.println("=========Car Specifaction ========");
        super.display();
        System.out.println("type of car : " + carType);
    }
}
