package subiect;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer>observers=new ArrayList<>();
    public void abonareObserver(Observer observer){
        this.observers.add(observer);
    }

    public void dezabonareObserver(Observer observer){
        this.observers.remove(observer);
    }

    public abstract void anuntaOferta();

    public void notificareObservers(String mesaj){
        for(Observer observer:observers){
            observer.primesteMesaj(mesaj);
        }
    }
}
