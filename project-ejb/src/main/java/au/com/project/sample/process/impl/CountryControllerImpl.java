/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package au.com.project.sample.process.impl;

import au.com.project.sample.domain.Country;
import au.com.project.sample.process.CountryController;
import java.util.List;

/**
 *
 * @author SONY
 */
public class CountryControllerImpl  implements CountryController{

    public void createCountry(Country country){}

    public void editCountry(Country country){}

    public void removeCountry(Country country){}

    public Country findCountry(Object id){return null;}

    public List<Country> findAllCountry(){return null;}

    public List<Country> findRangeCountry(int[] range){return null;}

    public int countCountry(){return 0;}
    
}
