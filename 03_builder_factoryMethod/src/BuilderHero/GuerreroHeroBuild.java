package BuilderHero;

public class GuerreroHeroBuild extends HeroBuilder{

    public GuerreroHeroBuild(String nick) {
        super(nick);
        hero.setAtack(10);
        hero.setVida(100);
        hero.setDefensa(5);
        hero.setMele(true);
        hero.setMana(0);
    }

}
