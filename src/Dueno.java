public class Dueno {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private boolean activo;    // boolean

    // Constructor
    public Dueno(String nombre, int edad, String telefono, String direccion, boolean activo) {

        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.activo = activo;
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("=== DUEÑO ===");
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad + " años");
        System.out.println("teléfono: " + telefono);
        System.out.println("dirección: " + direccion);
        System.out.println("activo: " + (activo ? "sí" : "no"));
    }
    public String getNombre() { return nombre; }
}

