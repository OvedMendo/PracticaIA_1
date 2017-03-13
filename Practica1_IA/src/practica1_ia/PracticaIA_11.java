package practica1_ia;

import java.util.ArrayList;
import practica1_ia.State1.Position;

/**
 *
 * @author MendoTaje
 */
public class PracticaIA_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        State1 initial = new State1();
        initial.oveja = Position.DERECHA;
        initial.repollo = Position.DERECHA;
        initial.lobo = Position.DERECHA;
        initial.granjero = Position.DERECHA;
        System.out.println("Estado inicial: " + initial);
        
        ArrayList<Transition1> next = initial.validTransition();
        System.out.println("Transiciones: " + next.size());
        
        for (Transition1 t: next){
            System.out.println("Acción: " + t.action);
            System.out.println(" Resultado: " + t.doTransition());
        }

    }

}
