package org.example.service;

import org.example.factory.SlabFactory;
import org.example.pojo.Slab;

import java.util.List;
import java.util.ListIterator;
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

        if (income < 0.0) {
            throw new RuntimeException("income can't be less than 0!");
        }

        double taxAmount = 0.0;
        ListIterator<Slab> it = slabs.listIterator();

        while(it.hasNext()) {
            Slab slab = it.next();

            if (income < slab.getMinthreshold()) {
                break;
            }

            if (income > slab.getMaxthreshold()) {
                taxAmount += (slab.getMaxthreshold() - slab.getMinthreshold()) * slab.getTaxRate();
                continue;
            }

            taxAmount += (income - slab.getMinthreshold()) * slab.getTaxRate();
        }

        return taxAmount;

    }
}
