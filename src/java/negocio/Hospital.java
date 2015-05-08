package negocio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hospital  implements java.io.Serializable {


     private byte hospitalCod;
     private String nombre;
     private String direccion;
     private String telefono;
     private Short numCama;
     private Set doctors = new HashSet(0);

    public Hospital() {
    }

	
    public Hospital(byte hospitalCod, String nombre) {
        this.hospitalCod = hospitalCod;
        this.nombre = nombre;
    }
    public Hospital(byte hospitalCod, String nombre, String direccion, String telefono, Short numCama, Set doctors) {
       this.hospitalCod = hospitalCod;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.numCama = numCama;
       this.doctors = doctors;
    }
   
    public byte getHospitalCod() {
        return this.hospitalCod;
    }
    
    public void setHospitalCod(byte hospitalCod) {
        this.hospitalCod = hospitalCod;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Short getNumCama() {
        return this.numCama;
    }
    
    public void setNumCama(Short numCama) {
        this.numCama = numCama;
    }
    public Set getDoctors() {
        return this.doctors;
    }
    
    public void setDoctors(Set doctors) {
        this.doctors = doctors;
    }

    public int generarID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Hospital> findAllActor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addHospital(Hospital h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


