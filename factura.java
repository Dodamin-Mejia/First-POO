package Tienda;

/**
 *
 * @author Elizabeth
 */
public class factura {
    private String nombreproveedor;
    private String producto;
    private int cantidad;
    
    public factura(){}
    
    public factura(String nombreproveedor, String producto, int cantidad){
        this.nombreproveedor = nombreproveedor;
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    //GETTERS
    public String getNombreproveedor(){
        return nombreproveedor;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    //SETTERS
    public void setNombreproveedor(String nombreproveedor){
        this.nombreproveedor = nombreproveedor;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}
