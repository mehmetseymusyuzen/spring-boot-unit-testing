import org.junit.jupiter.api.*;

import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    private static DemoUtils demoUtils;

    @BeforeAll
    static void setUp() {
        demoUtils = new DemoUtils();
    }

    @DisplayName("Equals and Not Equals For Add")
    @Test
    @Order(1)
        // Lowest Number has the highest priority
    void testEqualsAndNotEqualsForAdd() {

        // Set Up
        // DemoUtils demoUtils = new DemoUtils();

        int expected = 6;
        int unexpected = 8;

        // Execute
        int actual = demoUtils.add(3, 3);

        // Assert
        Assertions.assertEquals(expected, actual, "3+3 must be 6");
        Assertions.assertNotEquals(unexpected, actual, "3+3 must not be 8");

    }

    @DisplayName("Equals and Not Equals for Multiply")
    @Test
    void testEqualsAndNotEqualsForMultiply() {

        int expected = 21;
        int unexpected = 12;

        Assertions.assertEquals(expected, demoUtils.multiply(3, 7), "3*7 must be 21");
        Assertions.assertNotEquals(12, demoUtils.multiply(3, 7), "3*7 must not be 21");

    }

    @DisplayName("Null and Not Null")
    @Order(3)
    @Test
    void testNullAndNotNull() {

        // DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "Hello World";

        Assertions.assertNull(demoUtils.checkNull(str1), "Object should be null");
        Assertions.assertNotNull(demoUtils.checkNull(str2), "Object should be not null");

    }

    @DisplayName("Same and Not Same")
    @Order(2)
    @Test
    void testSameAndNotSame() {

        String expected = "Academy";
        // asserSame checks references
        Assertions.assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to same object");
        Assertions.assertNotSame(expected, demoUtils.getAcademy(), "Object should not refer to same object");

    }

    @DisplayName("True and False")
    @Test
    void testTrueAndFalse() {

        int grandOne = 10;
        int grandTwo = 5;

        Assertions.assertTrue(demoUtils.isGreater(grandOne, grandTwo), "This should return true");
        Assertions.assertFalse(demoUtils.isGreater(grandTwo, grandOne), "This should return false");

    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals() {

        String[] expectedArray = {"A", "B", "C"};

        Assertions.assertArrayEquals(expectedArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be same");

    }

    @DisplayName("Iterable Equals")
    @Test
    void testIterableEquals() {

        List<String> expectedList = List.of("My", "Academy", "code");

        Assertions.assertIterableEquals(expectedList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");

    }

    @DisplayName("Throws and Does Not Throw")
    @Test
    void testThrowsAndDoesNotThrows() {

        Assertions.assertThrows(
                Exception.class,
                () -> {
                    demoUtils.throwException(-1);
                }, "Should throw exception");

        Assertions.assertDoesNotThrow(
                () -> {
                    demoUtils.throwException(2);
                }, "Shout not throw exception"
        );
    }

}