import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class VowelTest
{
    @BeforeAll
    static void beforeAll()
    {
        System.out.println("Starting tests");
    }

    @Test
    void vowelOnlyTest1()
    {
        String input = "Hello";
        String expectedOutput = "eo";
        VowelOnly vowelOnly = new VowelOnly();
        Assertions.assertEquals(expectedOutput,vowelOnly.vowelOnly(input),"Ouput should contain only vowels for input " + input);
    }

    @Test
    void vowelOnlyTest2()
    {
        String input = "foo";
        String expectedOutput = "oo";
        VowelOnly vowelOnly = new VowelOnly();
        Assertions.assertEquals(expectedOutput,vowelOnly.vowelOnly(input),"Ouput should contain only vowels for input " + input);
    }

    @AfterAll
    static void afterAll()
    {
        System.out.println("Ending tests");
    }
}