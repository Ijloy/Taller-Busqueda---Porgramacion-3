import java.util.ArrayList;

public class Tienda {

    //Lista dinámica (ArrayList) que contiene todos los productos registrados en la tienda.
    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar producto manualmente
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Registrar venta
    public boolean registrarVenta(int id, int mes, int cantidad) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.registrarVenta(mes, cantidad);
                return true;
            }
        }
        return false;
    }

    // Actualizar precio
    public boolean actualizarPrecio(int id, double nuevoPrecio) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false;
    }

    // Búsqueda por ID
    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    // Búsqueda por nombre
    public Producto buscarPorNombre(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre))
                return p;
        }
        return null;
    }
}
