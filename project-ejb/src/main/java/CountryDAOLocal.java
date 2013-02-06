/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import au.com.project.sample.domain.Country;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SONY
 */
@Local
public interface CountryDAOLocal {

    void create(Country country);

    void edit(Country country);

    void remove(Country country);

    Country find(Object id);

    List<Country> findAll();

    List<Country> findRange(int[] range);

    int count();
    
}
