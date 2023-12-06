import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // If number divisible by 3, print Fizz
    // If number divisible by 5, print Buzz
    // If number divisible by 15, print FizzBuzz
    // If number not divisible by 3 or 5, then print the number

    private static FizzBuzz fizzBuzz;

    @BeforeAll
    public static void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @DisplayName("Divisible by Three")
    @Order(1)
    @Test
    void testForDivisibleByThree() {

        String expected = "Fizz";

        Assertions.assertEquals(expected, fizzBuzz.compute(9), "Should return Fizz");

    }

    @DisplayName("Divisible by Five")
    @Order(2)
    @Test
    void testForDivisibleByFive() {

        String expected = "Buzz";

        Assertions.assertEquals(expected, fizzBuzz.compute(10), "Should return Buzz");

    }

    @DisplayName("Divisible by Three and Five")
    @Order(3)
    @Test
    void testForDivisibleByThreeAndFive() {

        String expected = "FizzBuzz";

        Assertions.assertEquals(expected, fizzBuzz.compute(30), "Should return FizzBuzz");

    }

    @DisplayName("Not Divisible by Three or Five")
    @Order(4)
    @Test
    void testForNotDivisibleByThreeOrFive() {

        String expected = "1";

        Assertions.assertEquals(expected, fizzBuzz.compute(1), "Should return Number");

    }
    
}
