
package app;

public class App {

  
    public static void main(String[] args) {
        String nombreJuego = "Crash Bandicoot";
        
        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(1);
        
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(2);
        originator.setEstado(juego);
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(3);
        originator.setEstado(juego);
        
        caretaker.addMemento(originator.guardar()); //Primer estado guardado en la lista posicion 0
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(4);
        originator.setEstado(juego);
        
        caretaker.addMemento(originator.guardar());// Segundo Estado Posicion 1 
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(5);
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());// Segundo Estado Posicion 2
        
        originator.setEstado(juego);
        originator.restarurar(caretaker.getmemento(1));
        
        juego = originator.getEstado();
        System.out.println(juego);
        
    }
    
}
