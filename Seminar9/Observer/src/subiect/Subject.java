package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers=new ArrayList<>();

    public abstract void anuntaPlecare();
    public void  abonareObserver(Observer observer){
        this.observers.add(observer);
    }

    public void dezabonareObservable(Observer observer){
        this.observers.remove(observer);
    }

    protected void notificareObservers(String mesaj){
        this.observers.forEach(observer -> {
            observer.primesteMesaj(mesaj);
        });
    }
}
