package mex.s03;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void checkSignPositive() {
        String actual = Exercise1.checkSign(42);
        String expected = "positive";

        assertThat(actual, is(expected));
    }

    @Test
    void checkSignNegative() {
        String actual = Exercise1.checkSign(-42);
        String expected = "negative";

        assertThat(actual, is(expected));
    }

    @Test
    void checkSignZero() {
        String actual = Exercise1.checkSign(0);
        String expected = "zero";

        assertThat(actual, is(expected));
    }
}
