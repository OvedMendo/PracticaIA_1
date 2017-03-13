/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ia;

import java.util.ArrayList;
import practica1_ia.State1.Position;

/**
 *
 * @author MendoTaje
 */
public class Transition1 {
    public enum Action { MOVER_OVEJA, MOVER_REPOLLOS, MOVER_LOBO, MOVER_GRANNJERO
    }
    public State1 initial;
    public Action action;
    public State1 doTransition(){
           State1 result = new State1();
        if (action == Action.MOVER_GRANNJERO) { 
            result.oveja = initial.oveja;
            result.repollo = initial.repollo;
            result.lobo = initial.lobo;
            if (initial.granjero == Position.DERECHA)
                result.granjero = Position.IZQUIERDA;
            else
                result.granjero = Position.DERECHA;
                           
        }
        
        if (action == Action.MOVER_OVEJA){
           if (initial.oveja == Position.DERECHA)
                result.oveja = Position.IZQUIERDA;
            else
                result.oveja = Position.DERECHA;          
            result.repollo = initial.repollo;
            result.lobo = initial.lobo;
            if (initial.granjero == Position.DERECHA)
                result.granjero = Position.IZQUIERDA;
            else
                result.granjero = Position.DERECHA;
        }
        return result;
        
    }
    public Transition1(State1 initial, Action action){
        this.initial = initial;
        this.action = action;
    }
  

}

