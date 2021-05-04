package practice;

import java.math.BigDecimal;

public class Chapter04_2 {
    public static void main(String[] args) {
    	Basket01<Apple01> appleBasket = new Basket01<>(new Apple01("ふじ", new BigDecimal(200)));
    	Basket01<Peach01> peachBasket = new Basket01<>(new Peach01("黄金桃", new BigDecimal(300)));

    	appleBasket.printTotalPrice();
    	peachBasket.printTotalPrice();
    }
}
