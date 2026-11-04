package tema4.practica16;

/** Práctica 16: la sucursal guarda sus clientes y sus cuentas en arrays. */
public class Sucursal {

    public static final int MAX_CLIENTES = 5;
    public static final int MAX_CUENTAS = 10;

    private Cliente[] clientes = new Cliente[MAX_CLIENTES];
    private int numClientes = 0;
    private Cuenta[] cuentas = new Cuenta[MAX_CUENTAS];
    private int numCuentas = 0;

    // ---------------- clientes ----------------
    public boolean altaCliente(Cliente c) {
        if (numClientes == MAX_CLIENTES) {
            System.out.println("No caben más clientes");
            return false;
        }
        if (buscarCliente(c.getNombre(), c.getApellidos()) != null) {
            System.out.println("El cliente ya existe");
            return false;
        }
        clientes[numClientes++] = c;
        return true;
    }

    public Cliente buscarCliente(String nombre, String apellidos) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].esLlamado(nombre, apellidos)) {
                return clientes[i];
            }
        }
        return null;
    }

    /** Solo se puede dar de baja un cliente sin cuentas. */
    public boolean bajaCliente(String nombre, String apellidos) {
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i].esLlamado(nombre, apellidos)) {
                if (buscarCuentaDe(clientes[i]) != null) {
                    System.out.println("No se puede dar de baja: tiene una cuenta abierta");
                    return false;
                }
                // Desplazamos los siguientes una posición para no dejar huecos
                for (int j = i; j < numClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[--numClientes] = null;
                return true;
            }
        }
        System.out.println("Cliente no encontrado");
        return false;
    }

    public void listarClientes() {
        if (numClientes == 0) {
            System.out.println("No hay clientes");
        }
        for (int i = 0; i < numClientes; i++) {
            System.out.println((i + 1) + ". " + clientes[i]);
        }
    }

    // ---------------- cuentas ----------------
    public Cuenta buscarCuentaDe(Cliente c) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].leerTitular() == c) {
                return cuentas[i];
            }
        }
        return null;
    }

    public Cuenta crearCuenta(Cliente c) {
        if (numCuentas == MAX_CUENTAS) {
            System.out.println("No caben más cuentas");
            return null;
        }
        Cuenta nueva = new Cuenta(c);
        cuentas[numCuentas++] = nueva;
        return nueva;
    }
}
