package BuilderCasa;

public class Casa {
    private String color;
    private int numPisos;
    private int numHabitaciones;
    private int numBaños;
    private boolean tieneGaraje;
    private boolean tienePiscina;
    private boolean tieneJardin;
    private boolean tieneTerraza;

    public Casa() {
    }

    public Casa(String color, int numPisos, int numHabitaciones, int numBaños, boolean tieneGaraje, boolean tienePiscina, boolean tieneJardin, boolean tieneTerraza) {
        this.color = color;
        this.numPisos = numPisos;
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.tieneGaraje = tieneGaraje;
        this.tienePiscina = tienePiscina;
        this.tieneJardin = tieneJardin;
        this.tieneTerraza = tieneTerraza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public boolean isTieneJardin() {
        return tieneJardin;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    public boolean isTieneTerraza() {
        return tieneTerraza;
    }

    public void setTieneTerraza(boolean tieneTerraza) {
        this.tieneTerraza = tieneTerraza;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "color='" + color + '\'' +
                ", numPisos=" + numPisos +
                ", numHabitaciones=" + numHabitaciones +
                ", numBaños=" + numBaños +
                ", tieneGaraje=" + tieneGaraje +
                ", tienePiscina=" + tienePiscina +
                ", tieneJardin=" + tieneJardin +
                ", tieneTerraza=" + tieneTerraza +
                '}';
    }
}
