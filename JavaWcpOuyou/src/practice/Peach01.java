package practice;

import java.math.BigDecimal;

class Peach01 extends Fruit {
    Peach01(String name, BigDecimal price) {
    	super(name, price);
    }

    @Override
    protected String getName() {
    	return name;
    }

    @Override
    protected BigDecimal getPrice() {
    	return price;
    }
}
