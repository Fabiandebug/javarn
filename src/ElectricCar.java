public class ElectricCar implements Carinterface{

    @Override
    public void start() {
        System.out.println("Vehicle has started...");
    }

    @Override
    public void move(int speed) {
        System.out.println("Vehicle is moving at :" +speed +" Km/hr");
    }
}
