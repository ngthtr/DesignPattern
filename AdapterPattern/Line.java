package AdapterPattern;

public class Line implements IShape {

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("draw with: x1, y1, x2 + x1, y2 + y1");
        
    }
    
}
