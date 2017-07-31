/**
 * Created by karodes on 7/13/2017.
 */
public class Bus extends Automobile {
    String busType;
    boolean statusOfTv;

    public Bus(String engineType, String steeringType, int numberOfWheels, int topSpeed, int noOfShifts, int acceleration, String busType, boolean statusOfTv) {
        super(engineType, steeringType, numberOfWheels, topSpeed, noOfShifts, acceleration);
        this.busType = busType;
        this.statusOfTv = statusOfTv;

    }

    public boolean isStatusOfTv() {
        return statusOfTv;
    }

    public void setStatusOfTv(boolean statusOfTv) {
        this.statusOfTv = statusOfTv;
    }

    public void turnOnTv() {
        this.statusOfTv = true;
    }

    public void turnOffTv() {
        this.statusOfTv = false;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    @Override
    public void display() {
        System.out.println("=======Bus Specification ========");
        super.display();
        System.out.println("Bus Type : " + busType);
        System.out.println("Status of Tv : " + statusOfTv);
    }
}
