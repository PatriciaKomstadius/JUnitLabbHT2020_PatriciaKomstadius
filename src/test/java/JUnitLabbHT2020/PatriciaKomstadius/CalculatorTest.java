package JUnitLabbHT2020.PatriciaKomstadius;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    @Disabled
    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.multiply(5,5));
    }

    @RepeatedTest(5)
        void testSubtract(){
            Calculator calculator = new Calculator();
            assertEquals(15, calculator.subtract(20,5));
        }

        @Test
    void testDivide(){
        Calculator calculator = new Calculator();

        int result = calculator.divide(10, 2);
        assertTrue(result == 5);

        }

        @BeforeAll
        public static void init(){
            System.out.println("Kör tester för Calculator-klassen");
        }

        @AfterEach
    public void after(){
            System.out.println("Test klart");
        }

    }

