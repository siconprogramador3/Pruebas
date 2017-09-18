/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidades.Personal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import repositorios.PersonalFacadeLocal;

/**
 *
 * @author ANDY
 */
@Named(value = "cuentasMb")
@RequestScoped
public class CuentasMb {

    @EJB
    PersonalFacadeLocal ejbPersonal;
    
    private Personal personal;
     private List<Personal> personales ;

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Personal> getPersonales() {
        return ejbPersonal.findAll();
    }

 
     
    
    
    @PostConstruct
    public void init(){
        personal = new Personal();
        
    
    }
    public CuentasMb() {
    }
    
}
