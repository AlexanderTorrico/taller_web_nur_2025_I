public class Estudiante {

    private String nombre;
    private Calcular calificación;

    public Estudiante(String nombre, Calcular calificación) {
        this.nombre = nombre;
        this.calificación = calificación;
    }

    public int mostrarCalificación() {
        return calificación.calcular();
    }

    public String getNombre() {
        return nombre;
    }
}
