package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Slab {

    // inclusive threshold
    private final double minthreshold;

    // exclusive threshold
    private final double maxthreshold;

    private final double taxRate;
}
