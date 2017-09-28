import java.util.Observable;
import java.util.Observer;

class ObservableExample extends Observable {

    private String data;

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }

    @Override
    public String toString() {
        return super.toString() + ": " + data;
    }

    public static void main(String[] args) {
        ObservableExample example = new ObservableExample();
        MyObserver myObserver = new MyObserver();

        example.addObserver(myObserver);
        example.setData("new data");

    }   
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Object changed: " + arg);
    }
}