package practice;

import java.math.BigDecimal;

class Apple01 extends Fruit {
    Apple01(String name, BigDecimal price) {
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
