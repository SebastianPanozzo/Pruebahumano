import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Humane {

    private String nombre;
    private String apellido;
    private int dni;

    public Humane(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
    }
}

class Empleado extends Humane {

    private double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    public String toString() {
        return "\n" + super.toString() + "\nSueldo: " + this.sueldo;
    }
}

class Caja {
    private Empleado empleado;
    private int nroCaja;

    public Caja(Empleado empleado, int nroCaja) {
        this.empleado = empleado;
        this.nroCaja = nroCaja;
    }

    public String toString() {
        return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
    }
}

class Cliente extends Humane {

    private boolean mayorista;

    public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
        super(nombre, apellido, dni);
        this.mayorista = mayorista;
    }

    public boolean isMayorista() {
        return mayorista;
    }

    public String toString() {
        return "\n" + super.toString() + "\nMayorista: " + this.mayorista;
    }
}

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidad;
    }
}

// Nueva clase ProductoComprado
class ProductoComprado {
    private String nombre;
    private double precio;
    private int cantidadComprada;

    public ProductoComprado(String nombre, double precio, int cantidadComprada) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadComprada = cantidadComprada;
    }

    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Cantidad: " + cantidadComprada;
    }
}

// Nueva versión de la clase Transaccion
class Transaccion {
    private Cliente cliente;
    private Caja caja;
    private List<ProductoComprado> productosComprados;
    private Map<String, Integer> cantidadPorProducto;
    private double totalPagado;

    public Transaccion(Cliente cliente, Caja caja) {
        this.cliente = cliente;
        this.caja = caja;
        this.productosComprados = new ArrayList<>();
        this.cantidadPorProducto = new HashMap<>();
        this.totalPagado = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
            producto.reducirCantidad(cantidad);
            productosComprados.add(new ProductoComprado(producto.getNombre(), producto.getPrecio(), cantidad));
            totalPagado += producto.getPrecio() * cantidad;

            cantidadPorProducto.put(producto.getNombre(),
                    cantidadPorProducto.getOrDefault(producto.getNombre(), 0) + cantidad);
        } else {
            System.out.println("No hay suficiente cantidad de " + producto.getNombre());
        }
    }

    public double calcularTotal() {
        if (cliente.isMayorista()) {
            totalPagado *= 0.9; // Aplicar un 10% de descuento para mayoristas
        }
        return totalPagado;
    }

    public Map<String, Integer> getCantidadPorProducto() {
        return cantidadPorProducto;
    }

    public void mostrarDetalle() {
        System.out.println("Cliente: " + cliente.toString());
        System.out.println("Caja atendida por: " + caja.toString());
        System.out.println("Productos comprados:");
        for (ProductoComprado p : productosComprados) {
            System.out.println(p);
        }
        System.out.println("Total pagado: $" + calcularTotal());
    }
}

class Supermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Creación de empleados
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Maria", "Gomez", 23456789, 1500.0));
        empleados.add(new Empleado("Carlos", "Rodriguez", 33456789, 1600.0));
        empleados.add(new Empleado("Ana", "Fernandez", 43456789, 1700.0));
        empleados.add(new Empleado("Luis", "Martinez", 53456789, 1800.0));
        empleados.add(new Empleado("Elena", "Lopez", 63456789, 1900.0));

        // Creación de cajas
        List<Caja> cajas = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            cajas.add(new Caja(empleados.get(i), i + 1));
        }

        // Ingreso de la cantidad de clientes
        System.out.print("¿Cuántos clientes hay? ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        // Lista para almacenar las transacciones de cada cliente
        List<Transaccion> transacciones = new ArrayList<>();

        // Procesar cada cliente
        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("\nCliente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellidoCliente = scanner.nextLine();
            System.out.print("DNI: ");
            int dniCliente = scanner.nextInt();
            System.out.print("¿Es mayorista? (true/false): ");
            boolean esMayorista = scanner.nextBoolean();
            scanner.nextLine(); // Limpiar el buffer del scanner

            Cliente cliente = new Cliente(nombreCliente, apellidoCliente, dniCliente, esMayorista);

            // Asignar caja aleatoria
            Caja caja = cajas.get(random.nextInt(cajas.size()));

            // Crear transacción para el cliente
            Transaccion transaccion = new Transaccion(cliente, caja);

            // Ingreso de productos
            System.out.print("¿Cuántos productos desea comprar? ");
            int cantidadProductos = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            for (int j = 0; j < cantidadProductos; j++) {
                System.out.print("Ingresa el nombre del producto: ");
                String nombreProducto = scanner.nextLine();

                double precioProducto = 10 + random.nextDouble() * 90; // Generar precio entre 10 y 100
                System.out.print("Ingresa la cantidad de " + nombreProducto + " que deseas comprar: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                Producto producto = new Producto(nombreProducto, precioProducto, cantidad);
                transaccion.agregarProducto(producto, cantidad);
            }

            // Guardar transacción
            transacciones.add(transaccion);
        }

        // Mostrar detalles de todas las compras
        for (int i = 0; i < transacciones.size(); i++) {
            System.out.println("\n--- Detalle de la transacción del Cliente " + (i + 1) + " ---");
            transacciones.get(i).mostrarDetalle();
        }

        scanner.close();
    }
}