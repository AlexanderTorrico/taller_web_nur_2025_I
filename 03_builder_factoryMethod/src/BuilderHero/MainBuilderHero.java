package BuilderHero;

public class MainBuilderHero {

    public static void main(String[] args) {
        Hero hero = new MagoHeroBuild("Ogrin").build();

        System.out.println(hero);

    }
}
