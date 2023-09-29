package org.example.factory;

import org.example.pojo.Slab;

import java.util.List;

public class BasicSlabFactory implements SlabFactory{

    @Override
    public List<Slab> createSlabs() {

        return List.of(
                new Slab(0.0, 100.0, 0.0),
                new Slab(100.0, 200.0, 0.1),
                new Slab(200.0, 400.0, 0.2),
                new Slab(400.0, Double.POSITIVE_INFINITY, 0.25)
        );
    }
}
