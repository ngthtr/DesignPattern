package BuilderPattern;

public class Car extends CarBuilder {

    private Engine mEngine;
    private Wheel mWheel;
    private Door mDoor;

    public Car(Engine engine, Wheel wheel, Door door) {
        mEngine = engine;
        mWheel = wheel;
        mDoor = door;
    }

}
