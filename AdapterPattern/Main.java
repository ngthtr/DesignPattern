package AdapterPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Line line = new Line();

        List<IShape> shapes = new ArrayList<>(Arrays.asList(new RectangleAdapter(rectangle), new LineAdapter(line)));   
        for (IShape shape : shapes) {
            shape.draw(5, 10, 4, 7);
        }     
    }
}
