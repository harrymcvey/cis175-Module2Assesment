package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    public void testAdd() {
        Money money1 = new Money(5, 50);
        Money money2 = new Money(3, 75);
        Money result = money1.add(money2);

        // Check if the addition result is as expected
        assertEquals(new Money(9, 25), result);
    }

    @Test
    public void testSubtract() {
        Money money1 = new Money(10, 50);
        Money money2 = new Money(3, 75);
        Money result = money1.subtract(money2);

        // Check if the subtraction result is as expected
        assertEquals(new Money(6, 75), result);
    }
}

