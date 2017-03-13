/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_ia;

import java.util.ArrayList;
import practica1_ia.Transition1.Action;

/**
 *
 * @author MendoTaje
 */
public class State1 {

    public enum Position {DERECHA, IZQUIERDA}

    public Position oveja;
    public Position repollo;
    public Position lobo;
    public Position granjero;

    public boolean isValid() {
        if ((oveja == Position.DERECHA)&&
                (repollo == Position.DERECHA)&&
                (granjero == Position.IZQUIERDA))
                return false;
        if ((oveja == Position.DERECHA)&&
                (lobo == Position.DERECHA)&&
                (granjero == Position.IZQUIERDA))
                return false;
        //Terminar la lista de estados invalidos papu
        return true;
    }
    public boolean isFinal(){
        if ((oveja == Position.IZQUIERDA)&&
                (repollo == Position.IZQUIERDA)&&
                (lobo == Position.IZQUIERDA)&&
                (granjero == Position.IZQUIERDA))
                return true;
        return false;
    }
      public ArrayList<Transition1> validTransition(){
          ArrayList<Transition1> result = new
              ArrayList<Transition1>();
          //Mover al granjero siempre es posible
          result.add(new Transition1(this,Action.MOVER_GRANNJERO));
          //Mover a la oveja solo es posible con el granjero
          if(oveja == granjero){
              result.add(new Transition1(this, Action.MOVER_OVEJA));
          }
          //Mover a los demas objetos queda enla comodidad de su hogar
          return result;
          
      }
      
      public static void main(String[] args) {
          State1 test = new State1();
          System.out.println(test);
      }

    @Override
    public String toString() {
         return "Posicion ovejas: " + oveja + ", " +
                  "Posicion repollos: " + repollo + ", " +
                  "Posicion lobo: " + lobo + ", " +
                  "Posicion Granjero: " + granjero;    
      }
      


}

