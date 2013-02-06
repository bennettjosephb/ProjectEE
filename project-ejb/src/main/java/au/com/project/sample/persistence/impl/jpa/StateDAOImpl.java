/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.domain.State;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.local.StateDAOLocal;
import au.com.project.sample.persistence.remote.StateDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class StateDAOImpl extends AbstractDAO<State> implements StateDAOLocal, StateDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public StateDAOImpl() {
        super(State.class);
    }

    public void createState(State state) {
        create(state);
    }

    public void editState(State state) {
        edit(state);
    }

    public void removeState(State state) {
        remove(state);
    }

    public State findState(Object id) {
        return find(id);
    }

    public List<State> findAllStates() {
        return findAll();
    }
}
