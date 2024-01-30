

import com.anlov.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @DisplayName("Check")
    @ParameterizedTest
    @CsvSource(value = {
            "0, 1",
            "4, 24",
            "5, 120",
            "6, 720",

    })
    public void valueOfFactorial(int argument, long expected) {
        Assertions.assertEquals(expected, App.factorial(argument));
    }
}