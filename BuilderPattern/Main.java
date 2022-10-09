package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .addEngine(new Engine())
                .addDoor(new Door())
                .addWheel(new Wheel())
                .build();
        
    }
}