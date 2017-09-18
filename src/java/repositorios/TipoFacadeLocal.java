/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Tipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANDY
 */
@Local
public interface TipoFacadeLocal {

    void create(Tipo tipo);

    void edit(Tipo tipo);

    void remove(Tipo tipo);

    Tipo find(Object id);

    List<Tipo> findAll();

    List<Tipo> findRange(int[] range);

    int count();
    
}
