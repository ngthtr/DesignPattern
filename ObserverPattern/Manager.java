package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<IListener> mListListener;
    private static Manager mManager;

    private Manager() {
        mListListener = new ArrayList<>(); 
    }

    public static Manager getInstance() {
        if (mManager == null) {
            mManager = new Manager();
        }
        return mManager;
    }

    public void registerListener(IListener listener) {
        mListListener.add(listener);
    } 

    public void changePropertyEvent(Property property) {
        for (IListener listener : mListListener) {
            listener.onChangeEvent(property);
        }
    }

}
