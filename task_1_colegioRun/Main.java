import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CalcularPonderado calcularPonderado = new CalcularPonderado(50, 30, 20);
        Estudiante juan = new Estudiante("Juan", calcularPonderado);

        Estudiante jose = new Estudiante("Jose", new CalcularPromedio(new ArrayList<>(Arrays.asList(50, 30, 20))));

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(juan);
        estudiantes.add(jose);

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " " + estudiante.mostrarCalificación());
        }
    }
}