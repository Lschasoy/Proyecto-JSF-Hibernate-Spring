package bean;

import java.util.List;
import javax.faces.component.html.HtmlDataTable;
import negocio.Hospital;
import bo.HospitalBO;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Leonardo Siverio Chasoy
 */
public class BeanHospital implements java.io.Serializable{
    
    private List<Hospital> lista;
    private HtmlDataTable tabla;
    private boolean seleccion;
    private HospitalBO hospitalBO;
    
    
    
    public void seleccionLista(){
        Hospital h = (Hospital)tabla.getRowData();
        this.seleccion = true;
    }

    
    /*********** LISTA ****************/
    public List<Hospital> getLista() {        
        lista = hospitalBO.findAllActor();
        return lista;
    }

    public void setLista(List<Hospital> lista) {
        this.lista = lista;
    }

    /*********** TABLA ********************/ 
    public HtmlDataTable getTabla() {
        return tabla;
    }

    public void setTabla(HtmlDataTable tabla) {
        this.tabla = tabla;
    }
   
    /************* SELECCION *******************/ 
    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }
    /****************** ************************/
    
}
