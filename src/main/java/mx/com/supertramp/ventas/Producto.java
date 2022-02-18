
package mx.com.supertramp.ventas;

/**
 * @author mhernandezy
 */



public class Producto {
    
    
    
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    
    
    
    private Producto(){  // Al ser privado este constructor solo se puede utilizar dentro de la clase
    
        this.idProducto = ++Producto.contadorProductos;
    
    }
    
    
    
    
    public Producto(String nombre, double precio){
        
        this();  // llamada al constructor vacio, de esa forma se inicializa la variable idproducto
        this.nombre = nombre;
        this.precio = precio;
    
    }
    
    
    
    
      public int getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

  
    
    
    
  
    
}
