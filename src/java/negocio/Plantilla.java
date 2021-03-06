package negocio;

public class Plantilla  implements java.io.Serializable {


     private short empleadoNo;
     private Sala sala;
     private String apellido;
     private String funcion;
     private String turno;
     private Long salario;

    public Plantilla() {
    }

	
    public Plantilla(short empleadoNo, Sala sala, String apellido) {
        this.empleadoNo = empleadoNo;
        this.sala = sala;
        this.apellido = apellido;
    }
    public Plantilla(short empleadoNo, Sala sala, String apellido, String funcion, String turno, Long salario) {
       this.empleadoNo = empleadoNo;
       this.sala = sala;
       this.apellido = apellido;
       this.funcion = funcion;
       this.turno = turno;
       this.salario = salario;
    }
   
    public short getEmpleadoNo() {
        return this.empleadoNo;
    }
    
    public void setEmpleadoNo(short empleadoNo) {
        this.empleadoNo = empleadoNo;
    }
    public Sala getSala() {
        return this.sala;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFuncion() {
        return this.funcion;
    }
    
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    public String getTurno() {
        return this.turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Long getSalario() {
        return this.salario;
    }
    
    public void setSalario(Long salario) {
        this.salario = salario;
    }




}


