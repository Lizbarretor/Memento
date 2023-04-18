
package app;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList <Memento> mementos = new ArrayList<>();
    
    public void addMemento(Memento m){// Recibe como parametro el objeto memento guardado desde originator
    mementos.add(m);
    }
    public Memento getmemento(int index){//Recuperar segun la posicion o punto que queremos restaurar 
    return mementos.get(index);
    }
}
