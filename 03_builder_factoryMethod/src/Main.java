import BuilderCasa.Casa;
import BuilderCasa.CasaBuilder;

public class Main {
    public static void main(String[] args) {

//public Casa casa = new Casa("Blanco", 1, 3, 2, false, false, false, false);
        CasaBuilder casaBuilder = new CasaBuilder();

        Casa miCasa = casaBuilder.setColor("Rojo")
                .setNumPisos(2)
                .setNumHabitaciones(4)
                .setNumBaños(3)
                .setTieneGaraje(true)
                .setTienePiscina(false)
                .setTieneJardin(true)
                .setTieneTerraza(true)
                .build();

        System.out.println(miCasa);

    }
}