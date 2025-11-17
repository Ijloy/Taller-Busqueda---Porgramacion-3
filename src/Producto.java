public class Producto {

    //Variables
    private int id;
    private String nombre;
    private double precio;
    private int ventasMes1;
    private int ventasMes2;
    private int ventasMes3;

    //Constructor
    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ventasMes1 = 0;
        this.ventasMes2 = 0;
        this.ventasMes3 = 0;
    }

    //Getters  para devolver los valores
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    //Setters para actualizar el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Registra al aumento de ventas segun el mes
    public void registrarVenta(int mes, int cantidad) {
        switch (mes) {
            case 1 -> ventasMes1 += cantidad;
            case 2 -> ventasMes2 += cantidad;
            case 3 -> ventasMes3 += cantidad;
        }
    }

    //Devuelve una descripcion completa del producto
    @Override
    public String toString() {
        return "Producto:\n" +
                "ID: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Precio: $" + precio + "\n" +
                "Ventas mensuales: [" + ventasMes1 + ", " + ventasMes2 + ", " + ventasMes3 + "]";
    }
}
