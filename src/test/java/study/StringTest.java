package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).contains("1", "2");

        String[] actual2 = "1".split(",");
        assertThat(actual2).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)";
        actual = actual.substring(
            actual.indexOf("(") + 1, actual.lastIndexOf(")")
        );
        assertThat(actual).isEqualTo("1,2");
    }
}
