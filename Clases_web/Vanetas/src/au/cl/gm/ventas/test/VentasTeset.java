package au.cl.gm.ventas.test;

import au.cl.gm.ventas.Orden;
import au.cl.gm.ventas.Producto;

public class VentasTeset {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        //TO DO: nuevo objeto de tipo producto
        Producto producto3 = new Producto("Chalas", 4.00);
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        //TO DO: nuevo objeto de tipo orden
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
        //TO DO: nueva orden con nuevos productos
         producto1 = new Producto("Alfombra", 300.00);
         producto2 = new Producto("Cama", 150.00);
         Orden orden2 = new Orden();
         orden2.agregarProducto(producto1);
         orden2.agregarProducto(producto2);
         orden2.mostrarOrden();
    }
}
