/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import entidades.Software;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ANDY
 */
@Local
public interface SoftwareFacadeLocal {

    void create(Software software);

    void edit(Software software);

    void remove(Software software);

    Software find(Object id);

    List<Software> findAll();

    List<Software> findRange(int[] range);

    int count();
    
}
