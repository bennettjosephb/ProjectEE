/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.persistence.impl.jpa;

import au.com.project.sample.domain.Address;
import au.com.project.sample.persistence.AbstractDAO;
import au.com.project.sample.persistence.local.CityDAOLocal;
import au.com.project.sample.persistence.local.AddressDAOLocal;
import au.com.project.sample.persistence.remote.AddressDAORemote;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class AddressDAOImpl extends AbstractDAO<Address> implements AddressDAOLocal,AddressDAORemote {
    @PersistenceContext(unitName = "project")
    private EntityManager em;
    
    @EJB
    private CityDAOLocal cityDAO;

    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressDAOImpl() {
        super(Address.class);
    }
    
    public void createAddress(Address address){
        if (address.getCity().getId() == null){
            cityDAO.createCity(address.getCity());
        }
        create(address);
    }

    public void editAddress(Address address) {
        edit(address);
    }

    public void removeAddress(Address address) {
        remove(address);
    }

    public Address findAddress(Object id) {
        return find(id);
    }

    public List<Address> findAllAddress() {
        return findAll();
    }
            
}
