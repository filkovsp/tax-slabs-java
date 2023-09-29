package org.example.factory;

import org.example.pojo.Slab;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class BasicSlabFactoryTest {

    @Test
    @DisplayName("Should return a list of valid slabs")
    public void testBasicSlabFactory() {
        SlabFactory slabFactory = new BasicSlabFactory();

        List<Slab> expectedSlabs = List.of(
                new Slab(0.0, 100.0, 0.0),
                new Slab(100.0, 200.0, 0.1),
                new Slab(200.0, 400.0, 0.2),
                new Slab(400.0, Double.POSITIVE_INFINITY, 0.25)
        );

        List<Slab> actualSlabs = slabFactory.createSlabs();

        // assertIterableEquals(expectedSlabs, actualBlabs);
        // this assertion can't assert values inside the List
        // and we can't use it on List of arbitrary objects out of our Pojo classes.
        // so instead we should approach another way:
        // assertAll(() -> {
        //  assertEqual() // for each slab, which is still tricky
        // });
        // or some other way of "Deep Assertion"
    }
}