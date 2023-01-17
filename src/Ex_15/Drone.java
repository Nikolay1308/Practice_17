package Ex_15;

public class Drone extends Helicopter {
    public Drone(String mManufacture, float mMaxSpeed, float mMaxAltitude, String m_engine_power) {
        super(mManufacture, mMaxSpeed, mMaxAltitude, m_engine_power);
    }
    public void takeOff(){
        System.out.println("Now off taking");
    }
}
