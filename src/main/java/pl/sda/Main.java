package pl.sda;

import pl.sda.model.Cart;
import pl.sda.model.Item.Category;
import pl.sda.model.Item.Item;

import java.util.Scanner;

import static pl.sda.model.Cart.getCart;

public class Main {
private static Cart cart;
private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // **************************** TESTY
        Cart cart = getCart();
        Item item = new Item("Iphone 6", Category.PHONES, 500, 3);

        cart.addItemToCart(item, 3);


        cart.showTotal();
        // *********************

        int choice;

//        do{ System.out.println("Wybierz opcję: ");
//            System.out.println("1 - New item in database");
//            System.out.println("2 - Delete an item in database");
//            System.out.println("3 - Show all available items");
//            System.out.println("4 - Add item to the cart");
//            System.out.println("5 - Delete item from the cart");
//            System.out.println("6 - Show items in the cart");
//            System.out.println("7 - Order (finalize) the cart");
//            System.out.println("8 - Check an order's status");
//
//
//
//            choice = in.nextInt();
//            switch (choice){
//                case 1: addItem();
//            }
//
//        }



    }
}
