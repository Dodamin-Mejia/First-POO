package Tienda;

/**
 *
 * @author Elizabeth
 */
public class producto {
    private String nombre;
    private int cantidad;
    private String tipo;
    
    public producto(){}
    
    public producto(String nombre, int cantidad, String tipo){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
    //GETTERS    
    public String getNombre(){
        return nombre;
    }
    
    
    public int getCantidad(){
        return cantidad;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    //SETTERS    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
     public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
     
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
