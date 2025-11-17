public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;
    private Dueno dueno;

    //constructor

    public Mascota(String nombre, String especie, int edad, double peso, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
    }
    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }
    //Metodo void

    public void mostrarInformacion() {
        System.out.println("=== MASCOTA ===");
        System.out.println("nombre: " + nombre);
        System.out.println("especie: " + especie);
        System.out.println("edad: " + edad + "años");
        System.out.println("peso: " + peso + "kg");
        System.out.println("vacunado: " + (vacunado ? "yes" : "no"));

        if (dueno != null) {
            System.out.println();
            dueno.mostrarInformacion();
        }
    }
}