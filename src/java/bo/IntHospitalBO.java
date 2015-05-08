
package bo;

/**
 *
 * @author Leonardo Siverio Chasoy
 * 
 */

import java.util.List;
import negocio.Hospital;

public interface IntHospitalBO {
    
    public void addHospital(Hospital h);   // insert one hospital
    public List<Hospital> findAllActor();  // return list of objet's hospital 
    public int generarID();                // return Hospital_code    
}
