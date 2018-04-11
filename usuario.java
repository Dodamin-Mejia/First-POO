package Tienda;

/**
 *
 * @author Elizabeth
 */
public class usuario {
    private String nombre;
    private String codigo;
    
    public usuario(){}
    
    public usuario(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}
