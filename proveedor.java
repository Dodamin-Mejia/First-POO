package Tienda;

/**
 *
 * @author Elizabeth
 */
public class proveedor {
    private String nombre;
    private int numerotelefono;
    
    public proveedor(){}
    
    public proveedor(String nombre, int numerotelefono){
        this.nombre = nombre;
        this.numerotelefono = numerotelefono;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    
    public int getNumerotelefono(){
        return numerotelefono;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNumerotelefono(int numerotelefono){
        this.numerotelefono = numerotelefono;
    }
}
