package stringcalculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    StringCalculator cal;

    @BeforeEach
    void setUp() {
        cal = new StringCalculator();
    }

    @Test
    void run() {
        String case1 = cal.runWithoutUserInput("2 + 3 * 4 / 2");
        String case2 = cal.runWithoutUserInput("1 + 2 - 3 * 4");
        String case3 = cal.runWithoutUserInput("2 * 4 / 2 * 4");

        assertThat(case1).isEqualTo("10");
        assertThat(case2).isEqualTo("0");
        assertThat(case3).isEqualTo("16");
    }

    @AfterEach
    void tearDown() {
        cal = null;
    }
}
