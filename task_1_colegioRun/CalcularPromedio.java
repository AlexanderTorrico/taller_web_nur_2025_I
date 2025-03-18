import java.util.ArrayList;

public class CalcularPromedio implements  Calcular {
    private ArrayList<Integer> notas;

    public CalcularPromedio(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public int calcular() {

        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (int) suma / notas.size();
    }
}
