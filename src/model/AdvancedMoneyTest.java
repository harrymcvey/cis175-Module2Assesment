package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedMoneyTest {
    @Test
    public void testEquals() {
        Money money1 = new Money(5, 50);
        Money money2 = new Money(5, 50);
        Money money3 = new Money(6, 0);

        // Check if dollars and cents are equal
        assertEquals(money1.getDollars(), money2.getDollars());
        assertEquals(money1.getCents(), money2.getCents());

        assertEquals(money1.getDollars(), money3.getDollars());
        assertEquals(money1.getCents(), money3.getCents());
    }

}

