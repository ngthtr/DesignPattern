package ObserverPattern;

public class Property {
    private final int mId;
    private final Float mValue;

    public Property(int id, float value) {
        mId = id;
        mValue = value;
    }

    public int getId() {
        return mId;
    }

    public float getValue() {
        return mValue;
    }
}
