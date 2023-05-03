package pl.sda.model;

import pl.sda.model.Item.Item;

import java.util.HashMap;
import java.util.Map;

// SINGLETON
public class Cart {
    private static Map<Item, Integer> allItems;
    private static volatile Cart cart; // "volatile" uniemożliwia dostęp do cart wątkowi B, jesli wątek A nie skończył konstruuować obiektu.

    private Cart() {
        this.allItems = new HashMap<>();
    }

    public static Cart getCart() {
        if (cart == null) { // dodatkowy if przyspiesza działanie, przez ograniczenie synchronizacji wątków, tylko do przypadków gdy musi być stworzony nowy obiekt
            synchronized (Cart.class) { // zabezpiecza przed dostepem wielu watkow
                if (cart == null) {
                    cart = new Cart();
                }
            }
        }
        return cart;
    }

    public void addItemToCart(Item item, int quantity) {
/* //TODO implementacja zgodna z logika biznesowa -> w tej i pozostałych metodach tej klasy
1. spr czy jest dostepny, w bazie: taki item , taka ilość
2. jeśli 2x tak dodać do wózka, odjąć od dostępnych,
3. jeśli dostepna mniejsza ilosc, to dodac tyle ile sie da i wyświetlić komunikat
4. jeśli niedostepny to wyswietl komunikat i zaproponuj sledzenie dostepnosci
*/
        allItems.put(item, quantity);
    }

    public static void deleteFromCart(Item item, int quantity) {
        allItems.remove(item, quantity);
    }

    public static void showAllCartItem() {
        for (Map.Entry<Item, Integer> entry : allItems.entrySet()) {
            System.out.print(" Item name: " + entry.getKey().getName() + ", quantity: " + entry.getValue());
        }

    }
    public static void total() {

    }
    public static void ship() {

    }

}

