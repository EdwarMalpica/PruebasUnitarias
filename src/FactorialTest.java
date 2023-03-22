import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial factorial = new Factorial();

    //Cobertura de sentencias, Decision
    @Test
    void factorial() {
        assertEquals(1,factorial.factorial(0));
        assertEquals(1,factorial.factorial(1));
        assertEquals(2,factorial.factorial(2));
        assertEquals(6,factorial.factorial(3));
        assertEquals(24,factorial.factorial(4));
    }
}