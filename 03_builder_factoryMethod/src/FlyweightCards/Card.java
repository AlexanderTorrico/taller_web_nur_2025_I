package FlyweightCards;

public class Card {
    private int valor;
    private CartType tipo;

    public Card(int valor, CartType tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Card{" +
                "valor=" + valor +
                ", tipo=" + tipo +
                '}';
    }
}
