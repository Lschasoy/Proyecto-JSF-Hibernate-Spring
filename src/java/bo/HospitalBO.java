package bo;

/**
 *
 * @author Leonardo Siverio Chasoy
 * @description: Clase para implementar los servicios.
 */
import dao.HospitalDAO;
import java.util.List;
import negocio.Hospital;

public class HospitalBO implements IntHospitalBO{

    private Hospital hospitalDAO;

    public Hospital getHospitalDAO() {
        return hospitalDAO;
    }

    public void setHospitalDAO(Hospital hospitalDAO) {
        this.hospitalDAO = hospitalDAO;
    }
    
    public void addHospital(Hospital h) {
        this.hospitalDAO.addHospital(h);
    }
    
    public List<Hospital> findAllActor() {
        return this.hospitalDAO.findAllActor();
    }

    @Override
    public int generarID() {
        return this.hospitalDAO.generarID();
    }
    
}
