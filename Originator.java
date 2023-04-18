
package app;


public class Originator {  //Clase encargada de guardar el estado inicial del objeto 
    private Juego estado;

    public Juego getEstado() {
        return estado;
    }

    public void setEstado(Juego estado) {
        this.estado = estado;
    }
    
    public Memento guardar(){ // Se crea una nueva instancia del objeto memento con el estado que se quiere guardar
    return new Memento(estado);
    
    }
    public void restarurar (Memento m){// Le damos un objeto juego para que el originator sepa cual fue el ultimo estado restaurado
    this.estado = m.getEstado();
    }
    
}