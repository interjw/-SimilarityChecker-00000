import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkLengthTest {
    checkLength ck ;

    @BeforeEach
    void setUp() {
        ck = new checkLength();
    }

    @Test
    void isSame() {
        assertEquals(60, ck.getScore("ASD", "DSA"));
    }

    @Test
    void isWrong() {
        assertEquals(0, ck.getScore("A", "BB"));
    }

    @Test
    void isPart() {
        assertEquals(20, ck.getScore("AAABB", "BAA"));
    }

    @Test
    void isPart2() {
        assertEquals(30, ck.getScore("AA", "AAE"));
    }
}