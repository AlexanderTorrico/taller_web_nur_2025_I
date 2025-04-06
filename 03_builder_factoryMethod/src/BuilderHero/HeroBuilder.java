package BuilderHero;

abstract class HeroBuilder {
    Hero hero;

    public HeroBuilder(String nick) {
        hero = new Hero(nick);
    }

    public HeroBuilder setNick(String nick) {
        hero.setNick(nick);
        return this;
    }

    public HeroBuilder setAtack(int atack) {
        hero.setAtack(atack);
        return this;
    }

    public HeroBuilder setVida(int vida) {
        hero.setVida(vida);
        return this;
    }

    public HeroBuilder setDefensa(int defensa) {
        hero.setDefensa(defensa);
        return this;
    }

    public HeroBuilder setMele(boolean isMele) {
        hero.setMele(isMele);
        return this;
    }

    public HeroBuilder setMana(int mana) {
        hero.setMana(mana);
        return this;
    }

    public Hero build() {
        return hero;
    }



}
