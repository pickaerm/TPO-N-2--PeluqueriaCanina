
package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA= new MascotaJpaController();
    
    //Metodo para alta de una mascota
    public void crearMascota(Mascota mascota){
        
        try {
            mascotaJPA.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
  
    //metodo para baja de una mascota

    
    public void eliminarMascota(int idMascota) {
        
        try {
            mascotaJPA.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
