# 🛒 Sistema de Gestión de Tienda  
Proyecto en Java con interfaz creada en **IntelliJ UI Designer**

## 📌 Descripción  
Este proyecto es un sistema básico para gestionar productos de una tienda.  
Permite:

- Registrar productos manualmente desde la interfaz.
- Registrar ventas por mes.
- Actualizar el precio de un producto.
- Buscar productos por **ID** o por **nombre**.
- Mostrar datos del producto seleccionado.

El objetivo es practicar **POO**, **separación de interfaz e implementación**, y manejo básico de **GUI en Java** usando IntelliJ UI Designer.

---

## 🧱 Estructura del Proyecto

src/
├── Producto.java
├── Tienda.java
├── VentanaPrincipal.java (Interfaz en IntelliJ UI Designer)
└── Main.java


---

## 🐱‍💻 Clases principales

### **Producto**
Representa cada producto de la tienda.  
Contiene:  
- id  
- nombre  
- precio  
- ventas mensuales (array de 12 posiciones)

Métodos clave:  
- `registrarVenta(mes, cantidad)`  
- `setPrecio(nuevoPrecio)`  
- `getVentasAnuales()`  
- getters/setters

---

### **Tienda**  
Gestiona la lista de productos.

Funciones:  
- `agregarProducto(Producto p)`  
- `registrarVenta(id, mes, cantidad)`  
- `actualizarPrecio(id, nuevoPrecio)`  
- `buscarPorId(id)`  
- `buscarPorNombre(nombre)`

---

### **VentanaPrincipal**
Interfaz gráfica. Permite al usuario:

- Ingresar productos
- Registrar ventas
- Actualizar precio
- Buscar productos
- Mostrar datos

Diseñada con UI Designer y conectada mediante `createUIComponents()` y listeners.

---

### **Main**
Ejecuta la ventana principal.

---

## ▶️ Cómo ejecutar

1. Abrir el proyecto en **IntelliJ IDEA**.
2. Asegurarte de que la carpeta `src` esté marcada como *Sources Root*.
3. Ejecutar `Main.java`.
4. Se abrirá la ventana principal del sistema.

---

## 💾 Tecnologías utilizadas

- **Java 8+**
- **Swing**
- **IntelliJ UI Designer**
- **POO**
- **Listas dinámicas (ArrayList)**

---

## 📷 Capturas (opcional)
*Puedes agregar aquí capturas de tu interfaz cuando la tengas lista.*

---

## 📄 Licencia
Proyecto de práctica educativa — uso libre.

---

## ✨ Autor  
Grupo5-5540
