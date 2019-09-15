package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MultiplierTest {
    @Test
    public void multiply_handleSimpleInputs() {
        assertEquals(0, Multiplier.multiply(0, 0));

        assertEquals(1035, Multiplier.multiply(23, 45));

        assertEquals(-1904, Multiplier.multiply(-34, 56));
        assertEquals(Integer.MIN_VALUE, Multiplier.multiply(-32768, 65536));

        assertEquals(Integer.MAX_VALUE - 1, Multiplier.multiply(42966, 49981));
    }

    @Test
    public void multiply_throwsExceptionIfIntOverflow() {
        assertThrows(ArithmeticException.class, () -> {
            Multiplier.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE);
        });
        assertThrows(ArithmeticException.class, () -> {
            Multiplier.multiply(Integer.MIN_VALUE, Integer.MIN_VALUE);
        });

        assertThrows(ArithmeticException.class, () -> {
            Multiplier.multiply(Integer.MAX_VALUE, Integer.MIN_VALUE);
        });

        assertThrows(ArithmeticException.class, () -> {
            Multiplier.multiply(39650, 54161);
        });

        assertThrows(ArithmeticException.class, () -> {
            Multiplier.multiply(42967, 49981);
        });
    }
}
