package AdapterPattern;

public class LineAdapter implements IShape {
    private Line mLine;
    public LineAdapter(Line line) {
        mLine = line;
    }
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        mLine.draw(x1, y1, x2 + x1, y2 + y1);
        
    }
    
}
