/**
 * Created by karodes on 7/13/2017.
 */
public class Main {
    public static void main(String[] args) {
        FlyingCar flyCar = new FlyingCar("Turbo Dual", "power", 4, 400, 6, 23, "flying", 500, 2, 0, "ground");
        flyCar.display();
        Bus bus1 = new Bus("Diesel", "Power", 10,150, 6, 20, "Volvo", false);
        //bus1.display();
        bus1.turnOnTv();
        bus1.accelerate();
        bus1.display();
    }
}