import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWalkerTest {

    @Test
    void walkInTheArrayTest() {
        int[] masTest = Constants.ARRAY_WALK_TEST;
        assertArrayEquals(masTest, ArrayWalker.walkInTheArray());
    }
}