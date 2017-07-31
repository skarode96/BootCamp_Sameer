/**
 * Created by karodes on 7/13/2017.
 */
public class Automobile {
    String engineType;
    String steeringType;
    int numberOfWheels;
    int topSpeed;
    int noOfShifts;
    int loadCarryingCapacity;
    int acceleration;
    int speed;
    boolean statusOfEngine;

    Automobile(){

    }

    Automobile(String engineType, String steeringType, int numberOfWheels, int topSpeed, int noOfShifts, int acceleration) {
        this.engineType = engineType;
        this.steeringType = steeringType;
        this.numberOfWheels = numberOfWheels;
        this.topSpeed = topSpeed;
        this.noOfShifts = noOfShifts;
        this.acceleration = acceleration;
        this.speed = 0;
        this.statusOfEngine = false;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getNoOfShifts() {
        return noOfShifts;
    }

    public void setNoOfShifts(int noOfShifts) {
        this.noOfShifts = noOfShifts;
    }

    public boolean isStatusOfEngine() {
        return statusOfEngine;
    }

    public void setStatusOfEngine(boolean statusOfEngine) {
        this.statusOfEngine = statusOfEngine;
    }

    public int getLoadCarryingCapacity() {
        return loadCarryingCapacity;
    }

    public void setLoadCarryingCapacity(int loadCarryingCapacity) {
        this.loadCarryingCapacity = loadCarryingCapacity;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void startEngine() {
        this.statusOfEngine = true;
        System.out.println("Engine is started ! you are ready to go.");
    }

    public void killEngine() {
        this.statusOfEngine = false;
        System.out.println("Engine is killed.");
    }

    public void accelerate() {
        this.speed = this.speed + acceleration;
        System.out.println("After acceleration speed is " + this.speed);
    }

    public void brake() {
        this.speed = this.speed - 20;
        System.out.println("After braking speed is decreased to : " + this.speed);
    }

    public void display() {


        System.out.println("Engine Type : " + engineType);
        System.out.println("Steering Type : " + steeringType);
        System.out.println("Number of Wheels :" + numberOfWheels);
        System.out.println("Top Speed :" + topSpeed);
        System.out.println("Number of shifts : " + noOfShifts);
        System.out.println("Load carrying capacity : " + loadCarryingCapacity);
        System.out.println("Acceleration : " + acceleration);
        System.out.println("Speed : " + speed);

    }
}
