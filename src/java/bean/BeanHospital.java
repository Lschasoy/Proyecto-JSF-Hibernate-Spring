package bean;

/**
 *
 * @author Leonardo Siverio Chasoy
 */

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import bo.HospitalBO;

public class BeanHospital {
    
    private HospitalBO hospitalBO;

    public HospitalBO getHospitalBO() {
        return hospitalBO;
    }

    public void setHospitalBO(HospitalBO hospitalBO) {
        this.hospitalBO = hospitalBO;
    }
    
}
