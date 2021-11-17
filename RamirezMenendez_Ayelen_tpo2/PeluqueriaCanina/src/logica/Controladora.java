
package logica;

import persistencia.ControladoraPersistencia;


public class Controladora {
   
    ControladoraPersistencia controlPersistencia= new ControladoraPersistencia();
    
    //metodo para dar el alta a una mascota, funciona como pivote llamanndo al metodo crear de la persistencia
    public void crearMascota(Mascota cliente){
        controlPersistencia.crearMascota(cliente);
    }
    
    //metodo para dar el alta a una mascota pasandole los datos por parámetro
    public void crearMascota(int num_cliente, String nombre_perro, String raza, String color,boolean alergico, boolean atencion_especial, String nombre_duenio, String celular_duenio, String observaciones){
        
        //primero creo una instancia de mascota usando el constructor  vacío para que se genere asigne el id automáticamente
        Mascota nuevo_cliente= new Mascota();
        
        //luego setteo el resto de los campos
        nuevo_cliente.setNum_cliente(num_cliente);
        nuevo_cliente.setNombre_perro(nombre_perro);
        nuevo_cliente.setRaza(raza);
        nuevo_cliente.setColor(color);
        nuevo_cliente.setAlergico(alergico);
        nuevo_cliente.setAtencion_especial(atencion_especial);
        nuevo_cliente.setNombre_duenio(nombre_duenio);
        nuevo_cliente.setCelular_duenio(celular_duenio);
        nuevo_cliente.setObservaciones(observaciones);
        
        //llamo al método crearMascota de la persistencia con el nuevo cliente
        controlPersistencia.crearMascota(nuevo_cliente);
        
    }
    
    
    //a futuro se implementarán métodos para acceder, modificar y eliminar datos
    
}
