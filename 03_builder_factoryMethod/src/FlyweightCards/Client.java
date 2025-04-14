package FlyweightCards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();

        for (int i = 1; i <= 13; i++) {
            CartType cartType = CardTypeFactory.getCartType("♥", "Corazones", "assets/corazones.png");
            Card card = new Card(i, cartType);
            cards.add(card);
        }

        cards.stream().collect(Collectors.toList())
                .forEach(card -> System.out.println(card));
    }
}
