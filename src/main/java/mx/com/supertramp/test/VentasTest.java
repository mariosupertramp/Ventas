
package mx.com.supertramp.test;

import mx.com.supertramp.ventas.Orden;
import mx.com.supertramp.ventas.Producto;

/**
 *
 * @author mhernandezy
 */
public class VentasTest {
    
    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 50.20);
        Producto producto2 = new Producto("Pantalón", 13.33);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        
    }
    
    
    
    
    
    
}
