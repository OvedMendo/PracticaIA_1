package practicaIA_1;

import java.util.ArrayList;
import practicaIA_1.State.Position;

/**
 *
 * @author MendoTaje
 */
public class PracticaIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        State initial = new State();
        initial.oveja = Position.DERECHA;
        initial.repollo = Position.DERECHA;
        initial.lobo = Position.DERECHA;
        initial.granjero = Position.DERECHA;
        System.out.println("Estado inicial: " + initial);
        
        ArrayList<Transition> next = initial.validTransitions();
        System.out.println("Transiciones: " + next.size());
        
        for (Transition t: next){
            System.out.println("Acción: " + t.action);
            System.out.println(" Resultado: " + t.doTransition());
        }

    }

}
