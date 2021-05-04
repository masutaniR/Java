package practice;

import java.math.BigDecimal;

public class Chapter04 {
    public static void main(String[] args) {
    	Basket01<Apple01> apple = new Basket01<>(new Apple01("ふじ", new BigDecimal(200)));

    	apple.printName();
    }
}
