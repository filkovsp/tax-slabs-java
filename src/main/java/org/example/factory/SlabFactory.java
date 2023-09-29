package org.example.factory;

import org.example.pojo.Slab;

import java.util.List;

public interface SlabFactory {
    /**
     * Creates a list of Tax Slabs
     * @return immutable list of slabs
     */
    List<Slab> createSlabs();
}
