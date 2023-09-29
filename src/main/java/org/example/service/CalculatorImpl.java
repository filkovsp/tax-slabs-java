package org.example.service;

import org.example.factory.SlabFactory;
import org.example.pojo.Slab;

import java.util.List;
import java.util.Objects;

public class CalculatorImpl implements Calculator {

    private final SlabFactory slabFactory;
    private final List<Slab> slabs;

    public CalculatorImpl(SlabFactory slabFactory) {
        this.slabFactory = slabFactory;
        this.slabs = slabFactory.createSlabs();
    }

    @Override
    public double calculateTax(double income) {
        if (Objects.isNull(income)) {
            throw new RuntimeException("income can't be null!");
        }

        if (income < 0.0) {
            throw new RuntimeException("income can't be less than 0!");
        }

        return slabs.stream()
                .filter(slab -> income >= slab.getMinthreshold())
                .map(slab -> {
                    if (income > slab.getMaxthreshold()) {
                        return (slab.getMaxthreshold() - slab.getMinthreshold()) * slab.getTaxRate();
                    }
                    return (income - slab.getMinthreshold()) *  slab.getTaxRate();
                })
                .reduce(0.0, Double::sum);
    }
}
