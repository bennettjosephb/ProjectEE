/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.domain.Country;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.local.CountryDAOLocal;
import au.com.project.sample.persistence.remote.CountryDAORemote;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class CountryDAOImpl extends AbstractDAO<Country> implements CountryDAOLocal, CountryDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public CountryDAOImpl() {
        super(Country.class);
    }

    public void createCountry(Country country) {
        create(country);
    }

    public void editCountry(Country country) {
        edit(country);
    }

    public void removeCountry(Country country) {
        remove(country);
    }

    public Country findCountry(Object id) {
        return find(id);
    }

    public List<Country> findAllCountry() {
        return findAll();
    }

    public List<Country> findRangeCountry(int[] range) {
        return findRange(range);
    }

    public int countCountry() {
        return count();
    }
    
}
