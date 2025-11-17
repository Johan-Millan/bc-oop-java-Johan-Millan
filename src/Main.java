public class Main {
    public static void main(String[] args) {

        Mascota m1 = new Mascota("Mara", "Perro", 9, 15, true);
        Dueno d1 = new Dueno("Daniel", 20, "3445670983", "Suba", true);

        m1.setDueno(d1);   // <-- conexión correcta

        m1.mostrarInformacion();
    }
}