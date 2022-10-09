package BuilderPattern;

public class CarBuilder implements ICarBuider {

    private Engine mEngine;
    private Wheel mWheel;
    private Door mDoor;

    @Override
    public CarBuilder addEngine(Engine engine) {
        mEngine = engine;
        return this;
    }

    @Override
    public CarBuilder addWheel(Wheel wheel) {
        mWheel = wheel;
        return this;
    }

    @Override
    public CarBuilder addDoor(Door door) {
        mDoor = door;
        return this;
    }

    @Override
    public Car build() {
        return new Car(mEngine, mWheel, mDoor);
    }
}
