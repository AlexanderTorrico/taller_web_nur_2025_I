public class ProductoControlador {

    public void crearProducto(int id, String nombre, double precio) {
        // Lógica para crear un producto en la base de datos
        System.out.println("Producto creado: " + id + ", " + nombre + ", " + precio);
    }

    public void leerProducto(int id) {
        // Lógica para leer un producto de la base de datos
        System.out.println("Leyendo producto con ID: " + id);
    }

    public void actualizarProducto(int id, String nombre, double precio) {
        // Lógica para actualizar un producto en la base de datos
        System.out.println("Producto actualizado: " + id + ", " + nombre + ", " + precio);
    }

    public void eliminarProducto(int id) {
        // Lógica para eliminar un producto de la base de datos
        System.out.println("Producto eliminado con ID: " + id);
    }
}