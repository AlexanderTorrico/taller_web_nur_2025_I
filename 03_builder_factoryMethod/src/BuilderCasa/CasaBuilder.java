package BuilderCasa;

public class CasaBuilder {
    public Casa casa;

    public CasaBuilder() {
        casa = new Casa();
    }

    public CasaBuilder setColor(String color) {
        casa.setColor(color);
        return this;
    }

    public CasaBuilder setNumPisos(int numPisos) {
        casa.setNumPisos(numPisos);
        return this;
    }

    public Casa build() {
        return casa;
    }

    public CasaBuilder setNumHabitaciones(int numHabitaciones) {
        casa.setNumHabitaciones(numHabitaciones);
        return this;
    }

    public CasaBuilder setNumBaños(int numBaños) {
        casa.setNumBaños(numBaños);
        return this;
    }

    public CasaBuilder setTieneGaraje(boolean tieneGaraje) {
        casa.setTieneGaraje(tieneGaraje);
        return this;
    }

    public CasaBuilder setTienePiscina(boolean tienePiscina) {
        casa.setTienePiscina(tienePiscina);
        return this;
    }

    public CasaBuilder setTieneJardin(boolean tieneJardin) {
        casa.setTieneJardin(tieneJardin);
        return this;
    }

    public CasaBuilder setTieneTerraza(boolean tieneTerraza) {
        casa.setTieneTerraza(tieneTerraza);
        return this;
    }


}
