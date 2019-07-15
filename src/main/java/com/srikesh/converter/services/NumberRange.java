package com.srikesh.converter.services;

public class NumberRange {

	private final Integer min;
    private final Integer max;

    public NumberRange(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public boolean inRange(Integer number) {
        return min <= number && number <= max;
    }

    public void checkNumberExceedMax(Integer number) {
        if (number > max) {
            throw new RuntimeException("Number exceeds max range");
        }
    }
}
