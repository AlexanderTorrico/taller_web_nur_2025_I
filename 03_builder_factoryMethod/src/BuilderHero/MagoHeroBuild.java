package BuilderHero;

public class MagoHeroBuild extends  HeroBuilder{

    public MagoHeroBuild(String nick) {
        super(nick);
        hero.setAtack(5);
        hero.setVida(50);
        hero.setDefensa(2);
        hero.setMele(false);
        hero.setMana(100);
    }
}
