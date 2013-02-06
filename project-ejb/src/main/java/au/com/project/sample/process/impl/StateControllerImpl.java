/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.State;
import au.com.project.sample.process.StateController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class StateControllerImpl  implements StateController{

    public void createState(State state){}

    public void editState(State state){}

    public void removeState(State state){}

    public State findState(Object id){return null;}

    public List<State> findAllStates(){return null;}

    public List<State> findRange(int[] range){return null;}

    public int count(){return 0;}
    
}
