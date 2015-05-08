package dao;

import negocio.Hospital;
import java.util.List;

/**
 *
 * @author Leonardo Siverio Chasoy
 * @class Interfaz de la clase HospitalDAO
 */
public interface IntHospitalDAO {
    
    public void addHospital(Hospital h);
    public List<Hospital> findAllHospital();
    public int generarID();
}