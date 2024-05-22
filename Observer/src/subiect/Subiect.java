package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer>observers=new ArrayList<>();

    public abstract void anuntareMeci();
    public abstract void anuntaSport();

    public void abonareOberver(Observer observer){
        observers.add(observer);
    }
    public void dezabonareObserver(Observer observer){
        observers.remove(observer);
    }

    public void notificareObservers(String mesaj){
        for(Observer observer:observers){
            observer.primesteMesaj(mesaj);
        }
    }
}
