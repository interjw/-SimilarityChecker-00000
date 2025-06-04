import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkLengthTest {
    @Test
    void isSame() {
        checkLength ck = new checkLength();
        String input1="ASD";
        String input2="DSA";
        int exptected= 60;
        int actual = ck.getScore(input1,input2);
        assertEquals(exptected,actual);
    }
}