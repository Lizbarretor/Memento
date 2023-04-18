
package app;

public class Memento {
    private Juego estado;
    
    public Memento (Juego estado){//El constructor recibe el objeto en analisis "Juego" para almacenarlo en la variable "Estado"
        
    this.estado = estado;
    }

    public Juego getEstado() {
        return estado;
    }
    
}