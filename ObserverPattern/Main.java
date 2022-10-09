package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Manager manager = Manager.getInstance();
        IListener WIListener = new IListener() {
            @Override
            public void onChangeEvent(Property property) {
                System.out.println("OnChangeEvent: id = [" + property.getId() + "], value = [" + property.getValue() + "]");
            }
        };
        Property ADAS_PRESENT_DETAIL = new Property(1, 1);
        manager.registerListener(WIListener);
        
        manager.changePropertyEvent(ADAS_PRESENT_DETAIL);

    }
}
