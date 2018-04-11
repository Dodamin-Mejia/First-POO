
package tienda;
import Tienda.producto;
import Tienda.proveedor;
import Tienda.factura;
import Tienda.usuario;

/**
 *
 * @author Elizabeth
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //PRODUCTO
        producto producto1;
        producto1 = new producto("coca-cola", 5, "bebida");
        
        System.out.println(producto1.getNombre() + " " + producto1.getCantidad() + " " + producto1.getTipo());
        
        producto1.setNombre("manzanas");
        producto1.setCantidad(20);
        producto1.setTipo("comestible");
        
        System.out.println(producto1.getNombre() + " " + producto1.getCantidad() + " " + producto1.getTipo());
        
        //PROVEEDOR
        proveedor proveedor1;
        proveedor1 = new proveedor("la constancia", 22574151);
        
        System.out.println(proveedor1.getNombre() + " " + proveedor1.getNumerotelefono());
        
        proveedor1.setNombre("jumex");
        proveedor1.setNumerotelefono(20553211);
        
        System.out.println(proveedor1.getNombre() + " " + proveedor1.getNumerotelefono());
        
        //FACTURA
        factura factura1;
        factura1 = new factura("la constancia", "coca-cola", 100);
        
        System.out.println(factura1.getNombreproveedor() + " " + factura1.getProducto() + " " + factura1.getCantidad());
        
        factura1.setNombreproveedor("jumex");
        factura1.setProducto("jugo-manzana");
        factura1.setCantidad(200);
        
        System.out.println(factura1.getNombreproveedor() + " " + factura1.getProducto() + " " + factura1.getCantidad());
        
        //USUARIO
        usuario usuario1;
        usuario1 = new usuario("", "");
        
        System.out.println(usuario1.getNombre() + " " + usuario1.getCodigo());
        
        usuario1.setNombre("jumex");
        usuario1.setCodigo("AB57C");
        
        System.out.println(usuario1.getNombre() + " " + usuario1.getCodigo());
    }
    
}
