/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.domain.City;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.local.CityDAOLocal;
import au.com.project.sample.persistence.remote.CityDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class CityDAOImpl extends AbstractDAO<City> implements CityDAOLocal, CityDAORemote {

    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CityDAOImpl() {
        super(City.class);
    }

    public void createCity(City city) {
        create(city);
    }

    public void editCity(City city) {
        edit(city);
    }

    public void removeCity(City city) {
        remove(city);
    }

    public City findCity(Object id) {
        return find(id);
    }

    public List<City> findAllCity() {
        return findAll();
    }

    public List<City> findRangeCity(int[] range) {
        return findRange(range);
    }

    public int countCity() {
        return count();
    }
}
