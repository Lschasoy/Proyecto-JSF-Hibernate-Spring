package dao;

import java.util.List;
import negocio.Hospital;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
/**
 * @author Leonardo Siverio Chasoy
 * @clase Clase DAO de hospital
 */

public class HospitalDAO extends HibernateDaoSupport implements IntHospitalDAO{
       
    @Override
    public void addHospital(Hospital h) {
       getHibernateTemplate().saveOrUpdate(h);
    }
    @Override
    public List<Hospital> findAllHospital() {
       List<Object> tmp = getHibernateTemplate().find("from Hospital");
       
       List<Hospital> list = null;
       for(int i = 0; i < tmp.size(); i++){
           list.add((Hospital)tmp.get(i));
       }       
       return list;
       
    }

    
    @Override
    public int generarID() {
       /** Recuperar los datos **/
       List<Object> tmp; 
       tmp  = getHibernateTemplate().find("from Hospital as h order by h.nombre desc"); 
       /** Copiar los datos */
       List<Hospital> lista = null;
       for(int i = 0; i < tmp.size(); i++){
           lista.add((Hospital)tmp.get(i));
       }       
       
       if (lista.isEmpty()) return 1;
       return lista.get(0).getHospitalCod() + 1;
    }    
}