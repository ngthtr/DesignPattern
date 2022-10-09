package AdapterPattern;

public class RectangleAdapter implements IShape {
    private final Rectangle mRectangle;

    public RectangleAdapter(Rectangle rectangle) {
        mRectangle = rectangle;
    }
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int h = x1 - x2;
        int w = y1 - y2;
        mRectangle.draw(x2, y2, h, w);
    }
    
}
