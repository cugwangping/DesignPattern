package subject;

import observer.IObserver;
import state.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 平 on 2017/7/6.
 */
public class Ball {

    private List<IObserver> observers;

    public Ball() {
        observers = new ArrayList<IObserver>();
    }

    public void attachObserver(IObserver observer){
        observers.add(observer);
    }

    public void detachObserver(IObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (IObserver observer:observers){
            observer.update();
        }
    }

}
