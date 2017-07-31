/**
 * Created by karodes on 7/13/2017.
 */
public class FlyingCar extends Car {
    int jetEngineSpeed;
    int noOfPropellers;
    int pitch;
    String mode;

    public FlyingCar(String engineType, String steeringType, int numberOfWheels, int topSpeed, int noOfShifts, int acceleration, String carType, int jetEngineSpeed, int noOfPropellers, int pitch, String mode) {
        super(engineType, steeringType, numberOfWheels, topSpeed, noOfShifts, acceleration, carType);
        this.jetEngineSpeed = jetEngineSpeed;
        this.noOfPropellers = noOfPropellers;
        this.pitch = pitch;
        this.mode = mode;
    }

    public int getJetEngineSpeed() {
        return jetEngineSpeed;
    }

    public void setJetEngineSpeed(int jetEngineSpeed) {
        this.jetEngineSpeed = jetEngineSpeed;
        System.out.println("jet engine is set to : " + jetEngineSpeed);
    }

    public int getNoOfPropellers() {
        return noOfPropellers;
    }

    public void setNoOfPropellers(int noOfPropellers) {
        this.noOfPropellers = noOfPropellers;
    }

    public int getPitch() {
        return pitch;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Mode of the car is set to : " + mode);
    }
    public void pitchUp() {
        this.pitch = this.pitch + 2;
        System.out.println("Accelerating in vertical upward direction with pitch angle : " + this.pitch);
    }
    public void pitchDown() {
        this.pitch = this.pitch - 2;
        System.out.println("Accelerating in vertical downward direction with pitch angle : " + this.pitch);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Jet engine speed : " + this.jetEngineSpeed);
        System.out.println("No of propellers : " + this.noOfPropellers);
        System.out.println("Pitch of the flying car is : " + this.pitch);
    }
}
