package FlyweightCards;

import java.util.HashMap;

public class CardTypeFactory {

    private static HashMap<String, CartType> cartTypes = new HashMap<>();

    public static CartType getCartType(String simbolo, String tipo, String assets) {
        String key = simbolo + tipo + assets;
        CartType cartType = cartTypes.get(key);

        if (cartType == null) {
            cartType = new CartType(simbolo, tipo, assets);
            cartTypes.put(key, cartType);
        }

        return cartType;
    }
}
