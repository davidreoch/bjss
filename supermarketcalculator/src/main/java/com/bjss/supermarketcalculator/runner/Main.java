package com.bjss.supermarketcalculator.runner;

import com.bjss.supermarketcalculator.interfaces.DiscountOp;
import com.bjss.supermarketcalculator.objects.Basket;
import com.bjss.supermarketcalculator.objects.Item;
import com.bjss.supermarketcalculator.objects.discount.AppleDiscountOp;
import com.bjss.supermarketcalculator.objects.discount.DiscountTransaction;
import com.bjss.supermarketcalculator.objects.discount.SoupBreadDiscountOp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author David Reoch
 */
public class Main {

    /**
     * The main program loop
     * @param args The input items array
     */
    public static void main(String[] args) {
        final ItemFactory itemFactory = new ItemFactory();
        final BasketFactory basketFactory = new BasketFactory();
        final Basket basket = basketFactory.getBasket(args[0]);

        List<DiscountOp> ops = getDiscounts();
        Set<DiscountTransaction> discountTransactions = new HashSet<>();

        if (args.length > 0 && (args[0].equals("PriceBasket"))) {
            for (int i = 1; i < args.length; i++) {
                Item item = itemFactory.getItem(args[i]);
                if (item != null) {
                    basket.addItem(item);
                }else{
                    System.out.println("Error: item " + args[i] + " is not supported!");
                }
            }
        }
        else {
            System.out.println("Wrong format, please start command with type of basket e.g 'PriceBasket'.");
            System.exit(0);
        }

        Double total = basket.sum();
        System.out.println("Subtotal: £" + String.format("%.2f", total));

        ops.forEach((op) -> {
            discountTransactions.add(op.applyDiscountOp(basket));
        });

        boolean savingMade = false;
        for (DiscountTransaction discountTrans : discountTransactions) {

            if (Double.parseDouble(discountTrans.getSaving()) > 0.0) {
                savingMade = true;
                total = total - Double.parseDouble(discountTrans.getSaving());
                System.out.println(discountTrans.getMessage() + discountTrans.getSaving());
            }
        }

        if (!savingMade) {
            System.out.println("(no offers available)");
        }

        System.out.println("Total: £" + String.format("%.2f", total));
    }

    private static List<DiscountOp> getDiscounts() {
        List<DiscountOp> ret = new ArrayList<>();
        ret.add(new AppleDiscountOp());
        ret.add(new SoupBreadDiscountOp());
        return ret;
    }

}
