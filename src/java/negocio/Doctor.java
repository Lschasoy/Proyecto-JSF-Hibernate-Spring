package negocio;

public class Doctor  implements java.io.Serializable {


     private short doctorNo;
     private Hospital hospital;
     private String apellido;
     private String especialidad;
     private Long salario;

    public Doctor() {
    }

	
    public Doctor(short doctorNo, String apellido) {
        this.doctorNo = doctorNo;
        this.apellido = apellido;
    }
    public Doctor(short doctorNo, Hospital hospital, String apellido, String especialidad, Long salario) {
       this.doctorNo = doctorNo;
       this.hospital = hospital;
       this.apellido = apellido;
       this.especialidad = especialidad;
       this.salario = salario;
    }
   
    public short getDoctorNo() {
        return this.doctorNo;
    }
    
    public void setDoctorNo(short doctorNo) {
        this.doctorNo = doctorNo;
    }
    public Hospital getHospital() {
        return this.hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Long getSalario() {
        return this.salario;
    }
    
    public void setSalario(Long salario) {
        this.salario = salario;
    }




}


