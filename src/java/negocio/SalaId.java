package negocio;
// Generated 08-may-2015 9:34:13 by Hibernate Tools 3.6.0



/**
 * SalaId generated by hbm2java
 */
public class SalaId  implements java.io.Serializable {


     private byte hospitalCod;
     private byte salaCod;

    public SalaId() {
    }

    public SalaId(byte hospitalCod, byte salaCod) {
       this.hospitalCod = hospitalCod;
       this.salaCod = salaCod;
    }
   
    public byte getHospitalCod() {
        return this.hospitalCod;
    }
    
    public void setHospitalCod(byte hospitalCod) {
        this.hospitalCod = hospitalCod;
    }
    public byte getSalaCod() {
        return this.salaCod;
    }
    
    public void setSalaCod(byte salaCod) {
        this.salaCod = salaCod;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SalaId) ) return false;
		 SalaId castOther = ( SalaId ) other; 
         
		 return (this.getHospitalCod()==castOther.getHospitalCod())
 && (this.getSalaCod()==castOther.getSalaCod());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getHospitalCod();
         result = 37 * result + this.getSalaCod();
         return result;
   }   


}


