import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    //Atributos del UI DESIGNER
    private JPanel principal;
    private JTabbedPane panelVentas;
    private JTextField txtIdVenta;
    private JComboBox cmbMes;
    private JTextField txtCantidad;
    private JButton btnRegistrar;
    private JTextField txtIdPrecio;
    private JTextField txtNuevoPrecio;
    private JButton btnActualizar;
    private JLabel lblIdPrecio;
    private JLabel lblNewPrecio;
    private JLabel lblIdVenta;
    private JLabel lblMes;
    private JLabel lblCantidad;
    private JTextField txtBuscarId;
    private JButton btnBuscarId;
    private JTextField txtBuscarNombre;
    private JButton btnBuscarNombre;
    private JTextArea textAreaResultados;
    private JLabel lblBuscarId;
    private JLabel lblBuscarNombre;
    private JTextField txtIdProducto;
    private JTextField txtNombreProducto;
    private JTextField txtPrecioProducto;
    private JButton btnAgregarProducto;
    private JLabel lblIdProducto;
    private JLabel lblNombreProducto;
    private JLabel lblPrecioProducto;

    //Creacion del objeto en donde se guardan, actualizan y buscan los productos
    private Tienda tienda = new Tienda();

    //Constructor en donde iran los listeners de los botones
    public Ventana() {

        // BOTÓN: Agregar Producto
        btnAgregarProducto.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtIdProducto.getText());
                String nombre = txtNombreProducto.getText();
                double precio = Double.parseDouble(txtPrecioProducto.getText());

                tienda.agregarProducto(new Producto(id, nombre, precio));

                textAreaResultados.setText("Producto agregado correctamente:\n" + nombre);

            } catch (Exception ex) {
                textAreaResultados.setText("Error: Verifica los datos del producto.");
            }
        });

        // BOTÓN: Registrar Venta
        btnRegistrar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtIdVenta.getText());
                int mes = cmbMes.getSelectedIndex() + 1;
                int cantidad = Integer.parseInt(txtCantidad.getText());

                boolean ok = tienda.registrarVenta(id, mes, cantidad);

                if (ok)
                    textAreaResultados.setText("Venta registrada correctamente.");
                else
                    textAreaResultados.setText("Error: El ID ingresado no existe.");

            } catch (Exception ex) {
                textAreaResultados.setText("Error: Verifica los datos ingresados.");
            }
        });

        // BOTÓN: Actualizar Precio
        btnActualizar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtIdPrecio.getText());
                double nuevoPrecio = Double.parseDouble(txtNuevoPrecio.getText());

                boolean ok = tienda.actualizarPrecio(id, nuevoPrecio);

                if (ok)
                    textAreaResultados.setText("Precio actualizado correctamente.");
                else
                    textAreaResultados.setText("Error: No existe un producto con ese ID.");

            } catch (Exception ex) {
                textAreaResultados.setText("Error: Datos inválidos.");
            }
        });

        // BOTÓN: Buscar por ID
        btnBuscarId.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtBuscarId.getText());
                Producto p = tienda.buscarPorId(id);

                if (p != null)
                    textAreaResultados.setText(p.toString());
                else
                    textAreaResultados.setText("No se encontró un producto con ese ID.");

            } catch (Exception ex) {
                textAreaResultados.setText("Error: Ingrese un ID válido.");
            }
        });

        // BOTÓN: Buscar por Nombre
        btnBuscarNombre.addActionListener(e -> {
            try {
                String nombre = txtBuscarNombre.getText();
                Producto p = tienda.buscarPorNombre(nombre);

                if (p != null)
                    textAreaResultados.setText(p.toString());
                else
                    textAreaResultados.setText("No se encontró ese nombre.");

            } catch (Exception ex) {
                textAreaResultados.setText("Error: Intente nuevamente.");
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return principal;
    }

    //Crea la ventana principal del programa y muestra todo el contenido que se hace en el UI DESGINER
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tienda Online");
        frame.setContentPane(new Ventana().getPanelPrincipal());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
