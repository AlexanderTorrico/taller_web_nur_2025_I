package BuilderHero;

public class Hero {
    private String nick;
    private int atack;
    private int vida;
    private int defensa;
    private boolean isMele;
    private int mana;

    public Hero(String nick) {
        this.nick = nick;
    }

    public Hero(String nick, int atack, int vida, int defensa, boolean isMele, int mana) {
        this.nick = nick;
        this.atack = atack;
        this.vida = vida;
        this.defensa = defensa;
        this.isMele = isMele;
        this.mana = mana;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAtack() {
        return atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isMele() {
        return isMele;
    }

    public void setMele(boolean mele) {
        isMele = mele;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "nick='" + nick + '\'' +
                ", atack=" + atack +
                ", vida=" + vida +
                ", defensa=" + defensa +
                ", isMele=" + isMele +
                ", mana=" + mana +
                '}';
    }
}
