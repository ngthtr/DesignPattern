package BuilderPattern;

public interface ICarBuider {
    public CarBuilder addEngine(Engine engine);
    public CarBuilder addWheel(Wheel wheel);
    public CarBuilder addDoor(Door door);
    public Car build();
}
