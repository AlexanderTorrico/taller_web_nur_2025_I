public class CalcularPonderado implements Calcular {
    private int param1;
    private int param2;
    private int param3;

    public CalcularPonderado(int param1, int param2, int param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public int calcular() {
        return (int) (param1 *0.5 + param2 * 0.25 + param3 * 0.25);
    }
}
