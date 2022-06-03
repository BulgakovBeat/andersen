import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void getWeightTest() {
        List<Apple> listOfApple = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            listOfApple.add(new Apple());

        Box<Apple> firstBox = new Box<>(listOfApple, Apple.class);

        assertEquals(firstBox.getWeight(), Constants.THREE);
    }

    @Test
    void compareBoxesTest() {
        List<Apple> listOfApple = new ArrayList<>();

        for (int i = 0; i < Constants.THREE; i++)
            listOfApple.add(new Apple());

        Box<Apple> firstBox = new Box<>(listOfApple, Apple.class);

        List<Orange> listOfOrange = new ArrayList<>();

        for (int i = 0; i < Constants.THREE; i++)
            listOfOrange.add(new Orange());

        Box<Orange> secondBox = new Box<>(listOfOrange, Orange.class);

        assertFalse(firstBox.compareBoxes(secondBox));

        /////////////////////////////////////////////////
        List<Apple> listOfAppleTwo = new ArrayList<>();

        for (int i = 0; i < Constants.THREE; i++)
            listOfAppleTwo.add(new Apple());

        Box<Apple> thirdBox = new Box<>(listOfAppleTwo, Apple.class);

        System.out.println(firstBox.compareBoxes(thirdBox));

        assertTrue(firstBox.compareBoxes(thirdBox));
    }

    @Test
    void addFruitTest() {
        List<Apple> listOfApple = new ArrayList<>();

        for (int i = 0; i < Constants.THREE; i++)
            listOfApple.add(new Apple());

        Box<Apple> firstBox = new Box<>(listOfApple, Apple.class);

        firstBox.addFruit(new Apple());

        assertEquals(firstBox.getWeight(), Constants.FOUR);

        ///////////////////////////////////
        firstBox.addFruit(new Orange());

        assertEquals(firstBox.getWeight(), Constants.FOUR);
    }

    @Test
    void sprinkleFruitsTest() {
        List<Apple> listOfApple = new ArrayList<>();

        for (int i = 0; i < Constants.THREE; i++)
            listOfApple.add(new Apple());

        Box<Apple> firstBox = new Box<>(listOfApple, Apple.class);

        List<Apple> listOfAppleTwo = new ArrayList<>();

        for (int i = 0; i < Constants.THREE; i++)
            listOfAppleTwo.add(new Apple());

        Box<Apple> thirdBox = new Box<>(listOfAppleTwo, Apple.class);

        firstBox.sprinkleFruits(thirdBox);

        assertEquals(firstBox.getWeight(), Constants.SIX);
        assertEquals(thirdBox.getWeight(),Constants.ZERO);
    }
}